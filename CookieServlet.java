//Write a servlet to add a Cookie to clients machine that stores username, current date & time. Display the same.
import java.io.*;
import java.util.*;

public class CookieServlet extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
      
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    // Get the current date and time
    Date currentDate = new Date();
    String currentDateTime = currentDate.toString();

    // Get the username from the request parameter
    String username = request.getParameter("username");

    // Create a new cookie and set its value
    Cookie cookie = new Cookie("user", username + ";" + currentDateTime);
    cookie.setMaxAge(3600); // Set the cookie's max age to 1 hour

    // Add the cookie to the response
    response.addCookie(cookie);

    // Display the cookie's value
    out.println("<html>");
    out.println("<head>");
    out.println("<title>Add Cookie Servlet</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>Cookie Added</h1>");
    out.println("<p>Cookie value: " + cookie.getValue() + "</p>");
    out.println("</body>");
    out.println("</html>");
  }
}
