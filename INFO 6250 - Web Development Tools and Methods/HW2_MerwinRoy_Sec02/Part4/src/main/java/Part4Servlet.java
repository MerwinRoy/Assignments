/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author merwinroy
 */
public class Part4Servlet extends HttpServlet {

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
         PrintWriter out = response.getWriter();
         
         
         String username = request.getParameter("username");
         String password = request.getParameter("password");
         String csv = request.getParameter("csvName");
         
         if (!"parking_facilities.csv".equals(csv+".csv"))
         {
             JOptionPane.showMessageDialog(null, "Incorrect CSV Searched! " ,"ERROR", JOptionPane.ERROR_MESSAGE);
             
             
         }
         try
         {
            //Step 1. Load the JDBC driver, and register with the DriverManager
            Class.forName("org.relique.jdbc.csv.CsvDriver");
            String pathToFolder = "/Users/merwinroy/Desktop/Java CSV";
            String url = "jdbc:relique:csv:" + pathToFolder;
            
            //Step 2. Create a Connection obj to connect to the database
            Connection con = DriverManager.getConnection(url);
            
            //Step 3. Create a statement obj to execute a SQL query 
            Statement stmt = con.createStatement();
            
            //Step 4. Query the DB and process the results
            ResultSet rs = stmt.executeQuery("SELECT * FROM " + csv);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            out.println("<HTML>");
            out.println("<HEAD><TITLE>CSV Search: Parking Facilities</TITLE></HEAD>");
            out.println("<BODY>");
            out.println("<h1>Search Result:</h1><br/>");
            out.println("Username: " + username + "<br/>");
            out.println("Password: " + password + "<br/>");
            out.println("CSV File: " + csv + "<br/>");
            out.println("<hr>");
           
            out.println("<table border='1'>");
            out.println("<tr>");
            
            String head1 = rsmd.getColumnName(1);
            String head2 = rsmd.getColumnName(2);
            String head3 = rsmd.getColumnName(3);
            String head4 = rsmd.getColumnName(4);
            String head5 = rsmd.getColumnName(5);
            String head6 = rsmd.getColumnName(6);
            String head7 = rsmd.getColumnName(7);
            String head8 = rsmd.getColumnName(8);
            String head9 = rsmd.getColumnName(9);
            String head10 = rsmd.getColumnName(10);
            String head11 = rsmd.getColumnName(11);
            String head12 = rsmd.getColumnName(12);
            
            out.println("<th>" + head1 + "</th>");
            out.println("<th>" + head2 + "</th>");
            out.println("<th>" + head3 + "</th>");
            out.println("<th>" + head4 + "</th>");
            out.println("<th>" + head5 + "</th>");
            out.println("<th>" + head6 + "</th>");
            out.println("<th>" + head7 + "</th>");
            out.println("<th>" + head8 + "</th>");
            out.println("<th>" + head9 + "</th>");
            out.println("<th>" + head10 + "</th>");
            out.println("<th>" + head11 + "</th>");
            out.println("<th>" + head12 + "</th>");
            
            out.println("</tr>");
            while (rs.next())
            {
                out.println("<tr>");
                String col1 = rs.getString(1);
                String col2 = rs.getString(2);
                String col3 = rs.getString(3);
                String col4 = rs.getString(4);
                String col5 = rs.getString(5);
                String col6 = rs.getString(6);
                String col7 = rs.getString(7);
                String col8 = rs.getString(8);
                String col9 = rs.getString(9);
                String col10 = rs.getString(10);
                String col11 = rs.getString(11);
                String col12 = rs.getString(12);
                
                
                out.println("<td>" + col1 + "</td>");
                out.println("<td>" + col2 + "</td>");
                out.println("<td>" + col3 + "</td>");
                out.println("<td>" + col4 + "</td>");
                out.println("<td>" + col5 + "</td>");
                out.println("<td>" + col6 + "</td>");
                out.println("<td>" + col7 + "</td>");
                out.println("<td>" + col8 + "</td>");
                out.println("<td>" + col9 + "</td>");
                out.println("<td>" + col10 + "</td>");
                out.println("<td>" + col11 + "</td>");
                out.println("<td>" + col12 + "</td>");
                out.println("</tr>");
            }
            
            out.println("</table>");
            out.println("</BODY>");
            out.println("</HTML>");
         }
         catch (ClassNotFoundException ex) {
            System.out.println(" * * * * ClassNotFoundException: " + ex.getMessage());
        }
        catch (SQLException e)
        {
            System.out.println(" * * * * SQLException: " + e.getMessage());

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
