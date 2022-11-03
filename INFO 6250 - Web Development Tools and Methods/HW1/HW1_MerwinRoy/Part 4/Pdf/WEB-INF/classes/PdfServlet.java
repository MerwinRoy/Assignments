import java.io.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PdfServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String academicTerm = request.getParameter("academicTerm");
        String academicYear = request.getParameter("academicYear");

        String[] employeeStatus = request.getParameterValues("employeeStatus");

        String studentName = request.getParameter("studentName");
        String employeeRelation = request.getParameter("rel");
        String studentNuid = request.getParameter("nuid");
        String employeeName = request.getParameter("employeeName");
        String employeeNuid = request.getParameter("empNuid");
        String department = request.getParameter("department");
        String campusLocation = request.getParameter("campusLoc");
        String phoneNo = request.getParameter("phno");
        String supervisorName = request.getParameter("supervisorName");

        String program = request.getParameter("choice");

        String courseNo = request.getParameter("courseNo");
        String courseName = request.getParameter("courseName");
        String supervisorSignature = request.getParameter("supervisorSignature");
        String creditHrs = request.getParameter("creditHrs");
        String days = request.getParameter("days");
        String time = request.getParameter("time");

        String employeeSignature = request.getParameter("employeeSignature");
        String employeeSignatureDate = request.getParameter("empDate");

        String hrmApproval = request.getParameter("hrm");
        String hrmApprovalDate = request.getParameter("hrmDate");

        out.println("<HTML>");
        out.println("<HEAD><TITLE>FORM DETAILS</TITLE></HEAD>");
        out.println("<BODY>");
        out.println("<fieldset>");
        out.println("<legend><h1>Section 1</h1></legend>");
        out.println("<div>");
        out.println("Academic Term: " + academicTerm + "<br/><br/>");
        out.println("Academic Year: " + academicYear + "<br/><br/>");
        out.println("</div>");

        out.println("<div>");
        for (int i = 0; i < employeeStatus.length; i++) {
            out.println("Employee Status: " + employeeStatus[i] + ",<br/>");
        }
        out.println("</div>");

        out.println("</fieldset>");

        out.println("<fieldset>");
        out.println("<legend><h1>Section 2</h1></legend>");
        out.println("<div>");
        out.println("Student Name: " + studentName + "<br/><br/>");
        out.println("Relationship to Employee: " + employeeRelation + "<br/><br/>");
        out.println("Student's NUID: " + studentNuid + "<br/><br/>");
        out.println("Employee Name: " + employeeName + "<br/><br/>");
        out.println("Employee's NUID: " + employeeNuid + "<br/><br/>");
        out.println("Department: " + department + "<br/><br/>");
        out.println("Campus Location: " + campusLocation + "</br></br>");
        out.println("Phone number: " + phoneNo + "<br/><br/>");
        out.println("Supervisor's Name: " + supervisorName + "<br/><br/>");
        out.println("</fieldset>");
        out.println("</div>");

        out.println("<fieldset>");
        out.println("<legend><h1>Section 3</h1></legend>");
        out.println("<div>");
        out.println("Applicable School or Program: " + program + "<br/><br/>");
        out.println("</div>");

        out.println("Course Information<br/><br/>");
        out.println("<div>");
        out.println("Course No: " + courseNo + "<br/><br/>");
        out.println("Course Name: " + courseName + "<br/><br/>");
        out.println("Supervisor Signature: " + supervisorSignature + "<br/><br/>");
        out.println("Credit Hrs: " + creditHrs + "<br/><br/>");
        out.println("Day(s): " + days + "<br/><br/>");
        out.println("Time: " + time + "<br/><br/>");
        out.println("</div>");

        out.println("</fieldset>");

        out.println("<fieldset>");
        out.println("<legend><h1>Section 4</h1></legend>");
        out.println("<div>");
        out.println("Employee's Signature: " + employeeSignature + "<br/><br/>");
        out.println("Date - (emp_signature)" + employeeSignatureDate + "<br/><br/>");
        out.println("</div>");
        out.println("</fieldset>");

        out.println("<fieldset>");
        out.println("<legend><h1>Section 5</h1></legend>");
        out.println("<div>");
        out.println("HRM Approval: " + hrmApproval + "<br/><br/>");
        out.println("Date - (hrm_approval): " + hrmApprovalDate + "<br/><br/>");
        out.println("</div>");
        out.println("</fieldset>");

        out.println("</BODY>");
        out.println("</HTML>");
    }
}
