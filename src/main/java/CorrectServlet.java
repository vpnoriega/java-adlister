import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CorrectServlet", urlPatterns = "/correct")
public class CorrectServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String correctMsg = "You got it right! :) ";

        request.setAttribute("message", correctMsg);
        request.getRequestDispatcher("/correct.jsp").forward(request, response);


    }

}
// from correct servlet, it's going to request the "message". Then send that message to the jsp file