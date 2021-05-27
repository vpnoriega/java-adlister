import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// Create a page that displays a number that goes up by one every time the /count page is viewed.

@WebServlet(name = "CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet {

    // Create a page view counter
    private int hitCount = 0; //has to be outside the doGet

    //Create a page that displays a number that goes up by one every time the /count page is viewed.
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        hitCount++;

        response.setContentType("text/html"); //the browser needs to know what to run
        response.getWriter().println("<h2> This page has been visited: " + hitCount + " times! </h2>");

        //BONUS: Allow the user to pass a parameter in the query string to reset the counter.

        String reset = request.getParameter("reset");

        if(reset != null){
            hitCount = 1;

            response.setContentType("text/html"); //the browser needs to know what to run since it can't read h2
            response.getWriter().println("<h2> This page count has been reset to: " + hitCount + "</h2>");
        }


    }
}
