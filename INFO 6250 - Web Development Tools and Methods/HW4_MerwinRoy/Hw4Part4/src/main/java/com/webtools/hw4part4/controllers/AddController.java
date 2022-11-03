/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/AbstractController.java to edit this template
 */
package com.webtools.hw4part4.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author merwinroy
 */
public class AddController extends AbstractController {
    
    public AddController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        
            String Title = request.
                    getParameter("movieTitle");
            String Actor = request.
                    getParameter("leadActor");
            String Actress = request.
                    getParameter("leadActress");
            String Genre = request.
                    getParameter("movieGenre");
            String Year = (String)request.
                    getParameter("year");
            
            Class.forName("org.postgresql.Driver");
            String dburl = "jdbc:postgresql://localhost:5432/moviedb";
            String username = "postgres";

            String password = "password";
            
            Connection con = DriverManager.
                    getConnection(dburl, username, password);
            java.sql.Statement stmt;
            stmt = con.
                    createStatement();
            
            String query = "INSERT INTO public.\"movies\"(\"Title\",\"Actor\",\"Actress\",\"Genre\",\"Year\")\n" +
                           "VALUES ('{"+Title+"}','{"+Actor+"}','{"+Actress+"}','{"+Genre+"}','{"+Year+"}');";
            
            stmt.execute(query);
            
            return new ModelAndView("AddResult");
        
    }
    
}
