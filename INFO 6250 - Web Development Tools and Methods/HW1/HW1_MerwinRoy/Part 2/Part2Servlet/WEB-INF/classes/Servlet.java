import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet extends HttpServlet {
    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("HTTP headers sent by client...");

        out.println("<HTML>");
        out.println("<HEAD><TITLE>SERVLET: TO DISPLAY REQUEST HEADERS</TITLE></HEAD>");

        out.println("<BODY>");
        out.println("<h1>SERVLET: TO DISPLAY REQUEST HEADERS</h1><br/><br/>");
        out.println("HTTP headers sent by client...");

        out.println("<TABLE BORDER=1 ALIGN=\"CENTER\">");
        out.println("<TR>");
        out.println("<TH>Header Name<TH>Header Value");

        Enumeration headerNames = request.getHeaderNames();

        while (headerNames.hasMoreElements()) {
            String headerName = (String) headerNames.nextElement();
            String headerValue = request.getHeader(headerName);

            out.println("<TR><TD>" + headerName);
            out.println("  <TD>" + headerValue);

        }
        out.println("</TABLE>");

        out.println("</BODY>");
        out.println("</HTML>");

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }

    public void doPut(HttpServletRequest request, HttpServletResponse response) {

    }

    public void doDelete(HttpServletRequest request, HttpServletResponse response) {

    }

    public void destroy() {

    }
}
