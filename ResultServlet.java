import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ResultServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int score = 0;

    if ("Paris".equals(request.getParameter("q1"))) score++;
    if ("4".equals(request.getParameter("q2"))) score++;

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<html><body>");
    out.println("<h2>Your Score: " + score + "/2</h2>");
    out.println("<a href='index.html'>Try Again</a>");
    out.println("</body></html>");
  }
}
