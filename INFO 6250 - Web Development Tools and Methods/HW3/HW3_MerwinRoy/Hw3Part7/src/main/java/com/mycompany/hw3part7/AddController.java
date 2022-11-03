/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.hw3part7;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
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
public class AddController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {

            request.setAttribute("bookNo",request.getParameter("bookNo"));
            
            String[] isbn = request.getParameterValues("ISBN");
            String[] title=request.getParameterValues("Title");
            String[] authors=request.getParameterValues("Authors");
            String[] price=request.getParameterValues("Price");
            
            new ArrayList<String>(Arrays.asList(isbn));
            new ArrayList<String>(Arrays.asList(title));
            new ArrayList<String>(Arrays.asList(authors));
            new ArrayList<String>(Arrays.asList(price));
            
            String query = "INSERT INTO public.\"books\"(\"ISBN\",\"Title\",\"Authors\",\"Price\")\n" + "VALUES (?,?,?,?);";
            
            Class.forName("org.postgresql.Driver");
            
            String dburl = "jdbc:postgresql://localhost:5432/booksdb";
            
            String username = "postgres";
            
            String password = "password";
            
            Connection con = DriverManager.getConnection(dburl, username, password);
            PreparedStatement pStmt = con.prepareStatement(query);
            
            for(int i=0;i<Integer.parseInt(request.getParameter("bookNo"));i++)
            {
                pStmt.setString(1, isbn[i]);
                pStmt.setString(2, title[i]);
                pStmt.setString(3, authors[i]);
                pStmt.setFloat(4, Float.parseFloat(price[i]));
                pStmt.executeUpdate();
            }
       
            RequestDispatcher rdResult = request.getRequestDispatcher("JSP/AddResult.jsp");
            rdResult.forward(request, response);
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
            Logger.getLogger(AddController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddController.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(AddController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddController.class.getName()).log(Level.SEVERE, null, ex);
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
