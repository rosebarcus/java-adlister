
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

    private static int counter = 0;
    private String name = "";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        try {
            res.setContentType("text/html");
            PrintWriter out = res.getWriter();

            if (req.getParameter("neptune") != null) {
                String code = req.getParameter("neptune");
                if (code.equals("codeup")) ;
                this.counter = 0;
            }

            if(req.getParameter("name") != null) {
            name = req.getParameter("name");
            out.printf("<h1> Hello %s, count: %d</h1>", name, ++counter);
            }
            else out.printf("<h1>Hello World, count: %d</h1>", ++counter);
        } catch (IOException ex) {
            System.out.printf("ERROR %s\n", ex);
        }
        }
    }