/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/AbstractController.java to edit this template
 */
package com.webtools.hw4part4.controllers;

import com.webtools.hw4part4.pojo.Movie;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author merwinroy
 */


public class BrowseController extends AbstractController {
    
    
    
    public BrowseController() {
    }
    
    private String removeBrackets(String sample)
{
    sample = sample.replace("{", "");
    sample = sample.replace("}", "");
    return sample;
}
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        Class.forName("org.postgresql.Driver");
            String dburl = "jdbc:postgresql://localhost:5432/moviedb";
            String username = "postgres";

            String password = "password";
            
            Connection con = DriverManager.getConnection(dburl, username, password);
            
            java.sql.Statement stmt;
            stmt = con.
                    createStatement();
            String query = "";
            
            String keyword = request.
                    getParameter("keyword");
            if(request.
                    getParameter("choice").
                    equals("titleChoice"))
                
            query = "SELECT * FROM public.\"movies\" WHERE public.\"movies\".\"Title\"='{"+keyword+"}';";
            
            if(request.
                    getParameter("choice").equals("actorChoice"))
                
            query = "SELECT * FROM public.\"movies\" WHERE public.\"movies\".\"Actor\"='{"+keyword+"}';";
            
            if(request.
                    getParameter("choice").equals("actressChoice"))
                
            query = "SELECT * FROM public.\"movies\" WHERE public.\"movies\".\"Actress\"='{"+keyword+"}';";
            
            java.
                    sql.
                    ResultSet rs = stmt.
                            executeQuery(query);
            
            ArrayList<Movie> MovieList = new ArrayList <Movie>();
            
            while(rs.next())
            {
                Movie movie = new Movie();
                
                MovieList.add(movie);
                movie.
                        setTitle( removeBrackets(rs.getString(1)));
                movie.
                        setActor(removeBrackets(rs.getString(2)));
                movie.
                        setActress(removeBrackets(rs.getString(3)));
                movie.
                        setGenre(removeBrackets(rs.getString(4)));
                movie.
                        setYear(removeBrackets(rs.getString(5)));
            }
            
            request.setAttribute("MovieSearch", MovieList);
            
            return new ModelAndView("BrowseResult");
    }
    
}
