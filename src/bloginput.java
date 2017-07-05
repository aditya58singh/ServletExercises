import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class bloginput extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String blogid = request.getParameter("blogid");
        String blogcontent = request.getParameter("blogcontent");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ttn", "root", "aditya");
            PreparedStatement ps = connection.prepareStatement("insert into blog values(?,?)");

            ps.setString(1, blogid);
            ps.setString(2, blogcontent);

            if(blogid.isEmpty()  | blogcontent.isEmpty() ) {

                System.out.println("Data Not Stored");
                RequestDispatcher rd = request.getRequestDispatcher("fail.jsp");
                rd.forward(request, response);
            }

            else {

                ps.executeUpdate();
                System.out.println("Data Is Stored");
                RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
                rd.forward(request, response);


            }


        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

