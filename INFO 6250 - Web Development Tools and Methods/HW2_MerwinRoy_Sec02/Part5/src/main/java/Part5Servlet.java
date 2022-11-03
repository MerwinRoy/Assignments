/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 *
 * @author merwinroy
 */
@WebServlet(name = "Part5Servlet",urlPatterns = {"/Part5Servlet.xls"},description = "Annotated Servlet for Part 5 Assignment")
public class Part5Servlet extends HttpServlet {

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
        
        //Setting content type of response
        response.setContentType("text/html;charset=UTF-8");
        
        //Creating object for printwriter to display content on web page as response
        PrintWriter out = response.getWriter();
        
        //fetching xls name from index.html and storing in xls String object
        String xls = request.getParameter("xlsName");
        
        //File input stream to read xls file
        FileInputStream fs = new FileInputStream(new File("/Users/merwinroy/Desktop/Java CSV/"+xls+".xls"));
         
        //Workbook object that reads xls file
        Workbook wb = new HSSFWorkbook(fs);
        
        //Sheet object that obtains sheet from workbook object
        Sheet sheet = wb.getSheetAt(0);
        
        //Iterator to iterate to each row of the worksheet
        Iterator<Row> rIterator = sheet.iterator();
        
        //HTML
        out.println("<HTML>");
        out.println("<HEAD><TITLE>EXCEL FILE DETAILS</TITLE></HEAD>");
        out.println("<BODY>");
        out.println("<table border='1'>");
        
        //While loop that runs for all rows in the sheet
        while (rIterator.hasNext()) {
            out.println("<tr>");
            
            Row row = rIterator.next();
            
            //Iterator for each cell in a row
            Iterator<Cell> cIterator = row.cellIterator();
             
            
            //While loop that runs for all cells in a row
            while (cIterator.hasNext()) {
                
                
                Cell cell = cIterator.next();
                 
                //Switch case to check and print the type of content inside each cell
                switch (cell.getCellType()) {
                    case STRING:
                        out.println("<td>"+cell.getStringCellValue()+"</td>");
                        break;
                    case BOOLEAN:
                        out.println("<td>"+cell.getBooleanCellValue()+"</td>");
                        break;
                    case NUMERIC:
                        out.println("<td>"+cell.getNumericCellValue()+"</td>");
                        break;
                }
                
            }
           
            
        }
        out.println("</tr>");
        out.println("</table>");
        out.println("</Body>");
        out.println("</HTML>");
         
        //Closing workbook and filestream
        wb.close();
        fs.close();
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
