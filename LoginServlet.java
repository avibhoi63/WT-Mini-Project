import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String user = request.getParameter("username");
    String pass = request.getParameter("password");

    if ("admin".equals(user) && "1234".equals(pass)) {
      request.getRequestDispatcher("QuizServlet").forward(request, response);
    } else {
      response.getWriter().println("<h3>Invalid credentials. <a href='index.html'>Try again</a></h3>");
    }
  }
}
