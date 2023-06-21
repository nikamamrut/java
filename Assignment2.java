import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Assignment2 extends HttpServlet {
  public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    // get the username and password from the request
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    // check if the username and password are correct
    if (username.equals("Scott") && password.equals("tiger")) {
      // display welcome message
      out.println("<html>");
      out.println("<body>");
      out.println("<h1>Welcome " + username + "!</h1>");
      out.println("</body>");
      out.println("</html>");
    } else {
      // redirect to the login page again
      response.sendRedirect("http://localhost:8080/login.html");
    }

    out.close();
  }
}

