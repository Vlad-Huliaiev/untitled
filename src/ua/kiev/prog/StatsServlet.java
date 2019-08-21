package ua.kiev.prog;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StatsServlet extends HttpServlet {
    private static String firstName;
    private static String lastName;
    static int yes = 0;
    static int no = 0;
    static int service = 0;
    static int production = 0;

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");;
        String jobY = req.getParameter("yes");
        String jobN = req.getParameter("no");
        String as = req.getParameter("service");
        String ap = req.getParameter("production");

        if (jobY!=null){
            yes++;
        }
        else{
            no++;
        }
        if (as!=null){
            service++;
        }
        if (ap!=null){
            production++;
        }
        req.setAttribute("firstName", firstName);
        req.setAttribute("lastName", lastName);
        req.setAttribute("jobY", yes);
        req.setAttribute("jobN", no);
        req.setAttribute("service", service);
        req.setAttribute("production", production);

        RequestDispatcher rd = getServletContext().getRequestDispatcher("/stat.jsp");
        rd.forward(req, resp);
    }

}