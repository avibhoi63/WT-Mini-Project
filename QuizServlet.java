import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class QuizServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    PrintWriter out = response.getWriter();
    out.println("<html><body><form action='ResultServlet' method='post'>");
    out.println("<h2>1. What is the capital of France?</h2>");
    out.println("<input type='radio' name='q1' value='Paris'>Paris<br>");
    out.println("<input type='radio' name='q1' value='Rome'>Rome<br>");
    
    out.println("<h2>2. What is 2 + 2?</h2>");
    out.println("<input type='radio' name='q2' value='4'>4<br>");
    out.println("<input type='radio' name='q2' value='5'>5<br>");

    out.println("<br><input type='submit' value='Submit Quiz'>");
    out.println("</form></body></html>");
  }
}
