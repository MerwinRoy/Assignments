/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/AbstractController.java to edit this template
 */
package com.webtools.hw4part5.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Arrays;
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
                    request.
                            setAttribute("bookNo",request.
                            getParameter("bookNo"));
            
            String[] isbn = request.
                    getParameterValues("ISBN");
            
            String[] title=request.
                    getParameterValues("Title");
            
            String[] authors=request.
                    getParameterValues("Authors");
            
            String[] price=request.
                    getParameterValues("Price");
            
            new ArrayList<String>(Arrays.
                    asList(isbn));
            new ArrayList<String>(Arrays.
                    asList(title));
            new ArrayList<String>(Arrays.
                    asList(authors));
            new ArrayList<String>(Arrays.
                    asList(price));
            
            String query = "INSERT INTO public.\"books\"(\"ISBN\",\"Title\",\"Authors\",\"Price\")\n" + "VALUES (?,?,?,?);";
            
            Class.forName("org.postgresql.Driver");
            
            String dburl = "jdbc:postgresql://localhost:5432/booksdb";
            
            String username = "postgres";
            
            String password = "password";
            
            Connection con = DriverManager.
                    getConnection(dburl, username, password);
            
            PreparedStatement pStmt = con.
                    prepareStatement(query);
            
            for(int i=0;i<Integer.
                    parseInt(request.
                            getParameter("bookNo"));i++)
            {
                pStmt.
                        setString(1, isbn[i]);
                
                pStmt.
                        setString(2, title[i]);
                
                pStmt.
                        setString(3, authors[i]);
                
                pStmt.
                        setFloat(4, Float.parseFloat(price[i]));
                
                pStmt.
                        executeUpdate();
            }
            return new ModelAndView("AddResult");
    }
    
}
