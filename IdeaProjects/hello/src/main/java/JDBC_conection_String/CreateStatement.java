package JDBC_conection_String;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStatement {
    public static void CreateTable(){
        Connection connection = TestJDBCConection.getJDBCConnection();
        try {
            Statement statement = connection.createStatement();

            String sql = "create table giangvien (magv varchar(10), tengv varchar(30))";

            statement.executeUpdate(sql);
            System.out.println("sucessfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void DropTable(){
        Connection connection = TestJDBCConection.getJDBCConnection();
        try {
            Statement statement = connection.createStatement();

            String sql = "drop table giangvien";

            int rs = statement.executeUpdate(sql);
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CreateTable();
        //DropTable();
    }
}
