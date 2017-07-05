/**
 * Created by dell on 5/7/17.
 */

import java.sql.*;

public class LoginDao {
    public static boolean validate(String username, String password) {
        boolean status = false;
        {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ttn", "root", "aditya");

                Statement statement = connection.createStatement();
                ResultSet resultset = statement.executeQuery(
                        "SELECT * from servlet_exercise where username='" + username + "' AND password='" + password + "'");

                if(resultset.next())
                {
                    System.out.println("true");
                    return true;

                }
                else
                {
                    System.out.println("false");
                    return false;

                }

            } catch (Exception e) {
                System.out.println(e);
                return status;

            }

        }
    }
}

