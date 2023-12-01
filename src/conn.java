import  java.sql.*;
public class conn {
    Connection connection = null;
    Statement statement;
    conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");
            statement = connection.createStatement();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
