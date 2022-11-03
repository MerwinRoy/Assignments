import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FormServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("cpassword");
        String picture = request.getParameter("picture");
        String gender = request.getParameter("gender");
        String country = request.getParameter("country");
        String [] hobby = request.getParameterValues("hobby");
        String address = request.getParameter("address");

        out.println("<HTML>");
        out.println("<HEAD><TITLE>FORM DETAILS</TITLE></HEAD>");
        out.println("<BODY>");

        out.println("Email: " + email + "<br/>");
        out.println("Password: " + password + "<br/>");
        out.println("Picture-Path: " + picture + "<br/>");
        out.println("Gender: " + gender + "<br/>");
        out.println("Country: " + country + "<br/>");
        for(int i=0;i<hobby.length;i++)
        {
            out.print("Hobbies: " + hobby[i] + ",<br/>");
        }
        
        out.println("address: " + address + "<br/>");

        out.println("</BODY>");
        out.println("</HTML>");
    }
}