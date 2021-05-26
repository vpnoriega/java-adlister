import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet {

    private int hitCount = 0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        hitCount++;

        String reset = request.getParameter("reset");

        if(reset != null){
            hitCount = 1;

            response.setContentType("text/html"); //the browser needs to know what to run
            response.getWriter().println("<h2> This page count has been reset to: " + hitCount + "</h2>");
        }

        response.setContentType("text/html"); //the browser needs to know what to run
        response.getWriter().println("<h2> This page has been visited: " + hitCount + " times! </h2>");


    }
}
