package JDBC_conection_String;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBCConection {
    public static Connection getJDBCConnection(){
        final String url = "jdbc:mysql://localhost:3306/hello";
        final String user = "root";
        final String password = "12345678";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

//    public static void main(String[] args) {
//        Connection connection = getJDBCConnection();
//        if (connection != null){
//            System.out.println("Successful!");
//        }else{
//            System.out.println("False");
//        }
//    }
}
