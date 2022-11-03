/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.hw3part6;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author merwinroy
 */
public class BrowseController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    
    private String removeBrackets(String sample)
    {
        sample = sample.replace("{", "");
        sample = sample.replace("}", "");
        return sample;
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
            Class.forName("org.postgresql.Driver");
            String dburl = "jdbc:postgresql://localhost:5432/moviedb";
            String username = "postgres";

            String password = "password";
            
            Connection con = DriverManager.getConnection(dburl, username, password);
            java.sql.Statement stmt;
            stmt = con.createStatement();
            String query = "";
            String keyword = request.getParameter("keyword");
            if(request.getParameter("choice").equals("titleChoice"))
            query = "SELECT * FROM public.\"movies\" WHERE public.\"movies\".\"Title\"='{"+keyword+"}';";
            if(request.getParameter("choice").equals("actorChoice"))
            query = "SELECT * FROM public.\"movies\" WHERE public.\"movies\".\"Actor\"='{"+keyword+"}';";
            if(request.getParameter("choice").equals("actressChoice"))
            query = "SELECT * FROM public.\"movies\" WHERE public.\"movies\".\"Actress\"='{"+keyword+"}';";
            
            java.sql.ResultSet rs = stmt.executeQuery(query);
            
            ArrayList<Movie> MovieList = new ArrayList <Movie>();
            while(rs.next())
            {
                Movie movie = new Movie();
                
                MovieList.add(movie);
                movie.setTitle( removeBrackets(rs.getString(1)));
                movie.setActor(removeBrackets(rs.getString(2)));
                movie.setActress(removeBrackets(rs.getString(3)));
                movie.setGenre(removeBrackets(rs.getString(4)));
                movie.setYear(removeBrackets(rs.getString(5)));
            }
            
        request.setAttribute("MovieSearch", MovieList);
            
        RequestDispatcher rdBrowse = request.getRequestDispatcher("JSP/BrowseResult.jsp");
        rdBrowse.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BrowseController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BrowseController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BrowseController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BrowseController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
