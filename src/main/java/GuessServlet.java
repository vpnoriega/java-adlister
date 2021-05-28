import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {

//    private int counter = 0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        request.getRequestDispatcher("/guess.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String userInput = request.getParameter("userInput");
        Double randomNum = Math.floor(Math.random() * 4); //math.random gives you a number between 0-1, math.floor gives you a whole number

        if (userInput != null) {
            if (Double.parseDouble(userInput) == randomNum) {
                response.sendRedirect("/correct");
            } else {
                response.sendRedirect("/incorrect");
            }
        }
    }
}
