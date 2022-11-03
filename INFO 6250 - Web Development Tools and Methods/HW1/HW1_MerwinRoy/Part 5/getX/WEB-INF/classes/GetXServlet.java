import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class GetXServlet extends HttpServlet {
    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Get Methods....");

        // HttpServletRequest Get() methods
        String authType = request.getAuthType();
        String contextPath = request.getContextPath();
        String method = request.getMethod();
        String pathInfo = request.getPathInfo();
        String pathTranslated = request.getPathTranslated();
        String queryString = request.getQueryString();
        String remoteUser = request.getRemoteUser();
        String requestedSessionId = request.getRequestedSessionId();
        String requestURI = request.getRequestURI();
        String servletPath = request.getServletPath();

        // ServletRequest get() methods
        String contentType = request.getContentType();
        String localAddress = request.getLocalAddr();
        String localName = request.getLocalName();
        String protocol = request.getProtocol();
        String remoteAddr = request.getRemoteAddr();
        String remoteHost = request.getRemoteHost();

        out.println("<HTML>");
        out.println("<Body>");
        out.println("<h1>Get() methods of HttpServletRequest..</h1>");
        out.println("getAuthType(): " + authType + "<br/><br/>");
        out.println("getContextPath(): " + contextPath + "<br/><br/>");
        out.println("getMethod(): " + method + "<br/><br/>");
        out.println("getPathInfo(): " + pathInfo + "<br/><br/>");
        out.println("getPathTranslated(): " + pathTranslated + "<br/><br/>");
        out.println("getQueryString(): " + queryString + "<br/><br/>");
        out.println("getRemoteUser(): " + remoteUser + "<br/><br/>");
        out.println("getRequestedSessionId(): " + requestedSessionId + "<br/><br/>");
        out.println("getRequestURI(): " + requestURI + "<br/><br/>");
        out.println("getServletPath(): " + servletPath + "<br/><br/>");

        out.println("<hr>");
        out.println("<h1>Get() methods of ServletRequest interface..</h1> ");
        out.println("getcontentType(): " + contentType + "<br/><br/>");
        out.println("getlocalAddr(): " + localAddress + "<br/><br/>");
        out.println("getlocalName(): " + localName + "<br/><br/>");
        out.println("getProtocol(): " + protocol + "<br/><br/>");
        out.println("getRemoteAddr(): " + remoteAddr + "<br/><br/>");
        out.println("getRemoteHost(): " + remoteHost + "<br/><br/>");

        out.println("</Body>");
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