/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author merwinroy
 */
@WebServlet(name="Part8Servlet",urlPatterns = {"/Part8Servlet"},description="Annotated Servlet for Part  8 Assignment")
public class Part8Servlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out  = response.getWriter();
        
        Map map = request.getParameterMap();
        
        Set set = map.entrySet();
        
        Iterator iterator = set.iterator();
        
        

        out.println("<HTML>");
        out.println("<HEAD><TITLE>FORM DETAILS</TITLE></HEAD>");
        out.println("<BODY>");
        
        
        while (iterator.hasNext())
        {
            Map.Entry<String,String[]> pair = (Map.Entry<String,String[]>)iterator.next();
            
            String keys = pair.getKey();
            String [] values = pair.getValue();
            
            out.print(keys+" : ");
            if(values.length>1){
                for(int i =0; i<values.length;i++)
                {
                    
                    out.println(values[i]+",");
                    
                }
                out.println("<br>");
                
            }
            else{
                out.println(values[0]+"<br>");
            }
            out.println("<br>");
            
            
        
        }
        
        out.println("</BODY>");
        out.println("</HTML>");
 
    
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
        processRequest(request, response);
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
        processRequest(request, response);
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
