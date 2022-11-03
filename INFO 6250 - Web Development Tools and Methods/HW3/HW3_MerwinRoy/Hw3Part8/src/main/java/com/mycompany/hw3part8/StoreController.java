/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.hw3part8;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author merwinroy
 */
public class StoreController extends HttpServlet {

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
            throws ServletException, IOException {
            PrintWriter out = response.getWriter();
       
            request.setAttribute("Cart", request.getParameter("Cart"));
            
            HttpSession Ses = request.getSession(true);
            
            Enumeration<String> attrNames = Ses.getAttributeNames();
            
            int i=0;
            
            while(attrNames.hasMoreElements())
            {
                String attrName = (String)attrNames.nextElement();
                
                if(attrName.equals("Cart"))
                    
                    i=1;
            }
            
            if((Ses.getAttribute("Cart")==null) && request.getParameter("Cart").equals("FillCart"))
            {
               
            String[] productSelected=request.getParameterValues("productSelected");
            
            new ArrayList<String>(Arrays.asList(productSelected));
        
            ArrayList<String> Bag = new ArrayList <String>();
            
            for(String product:productSelected)
            {
                Bag.add(product);
            }
            request.setAttribute("productSelected", productSelected);
            
            Ses.setAttribute("Cart", Bag);
            
            RequestDispatcher rdView = request.getRequestDispatcher("ToCart.jsp");
            
            rdView.forward(request, response);
            } 
            
            else if((Ses.getAttribute("Cart")!=null) && request.getParameter("Cart").equals("FillCart"))
            {
               
                String[] productsSelected=request.getParameterValues("productSelected");
                
                new ArrayList<String>(Arrays.asList(productsSelected));
        
                 ArrayList<String> Bag = (ArrayList <String>) Ses.getAttribute("Cart");
                 
            for(String product:productsSelected)
            {
                Bag.add(product);
            }
            
            request.setAttribute("productsSelected", productsSelected);
            
            Ses.setAttribute("Cart", Bag);
            
            RequestDispatcher rdView = request.getRequestDispatcher("ToCart.jsp");
            
            rdView.forward(request, response);
            }
            
            if(request.getParameter("Cart").equals("DisplayCart"))
            {
                RequestDispatcher rdView = request.getRequestDispatcher("DisplayCart.jsp");
                
                rdView.forward(request, response);
            }
            
            if(request.getParameter("Cart").equals("RemoveCart"))
            {
                String[] productsRemove=request.getParameterValues("productsRemove");
                
                new ArrayList<String>(Arrays.asList(productsRemove));
                
                request.setAttribute("productsRemove", productsRemove);
                
                if(Ses.getAttribute("Cart")!=null)
                {
                    ArrayList<String> Bag = (ArrayList <String>) Ses.getAttribute("Cart");
                    
                    for(String product:productsRemove)
                    {
                        Bag.remove(product);
                    }
                }
                RequestDispatcher rdView = request.getRequestDispatcher("RemoveSuccess.jsp");
                
                rdView.forward(request, response);
            }
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
        PrintWriter out = response.getWriter();
        if(request.authenticate(response))
        {
            processRequest(request, response);
        }
        else{
            out.println("Failure to authenticate");
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
        PrintWriter out = response.getWriter();
        if(request.authenticate(response))
        {
        processRequest(request, response);
        }
        else{
             out.println("Failure to authenticate");
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
