import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        if (LoginDao.validate(user, pass)) {

            RequestDispatcher rd = request.getRequestDispatcher("blog.jsp");
            rd.forward(request, response);


        } else
            System.out.print("Sorry username or password error");
        RequestDispatcher rd = request.getRequestDispatcher("fail.jsp");
        rd.include(request, response);


    }
}