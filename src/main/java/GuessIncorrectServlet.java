import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessIncorrectServlet", urlPatterns = "/incorrect")
public class GuessIncorrectServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("outcome", "That was a wrong guess");
        request.getRequestDispatcher("guessResult.jsp").forward(request, response);
    }
}
