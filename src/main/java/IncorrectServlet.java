import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "IncorrectServlet", urlPatterns = "/incorrect")
public class IncorrectServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String incorrectMsg = "You got it wrong :( ";
        request.setAttribute("message", incorrectMsg);
        request.getRequestDispatcher("/correct.jsp").forward(request, response);

    }

}