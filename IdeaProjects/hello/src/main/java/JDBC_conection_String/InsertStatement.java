package JDBC_conection_String;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStatement {
    public static void InsertTable(){
        Connection connection = TestJDBCConection.getJDBCConnection();
        try {
            Statement statement = connection.createStatement();
            String sql = "insert into giangvien(magv,tengv) value('gv1', 'huy'),('gv2','ha'),('gv3','van')";
            int rs = statement.executeUpdate(sql);
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void UpdateTable(){
        Connection connection = TestJDBCConection.getJDBCConnection();
        try {
            Statement statement = connection.createStatement();
            String sql = "update giangvien set tengv = 'ha' where magv = 'gv1'";
            int rs = statement.executeUpdate(sql);
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void DeleteTable(){
        Connection connection = TestJDBCConection.getJDBCConnection();
        try {
            Statement statement = connection.createStatement();
            String sql = "delete from giangvien ";
            int rs = statement.executeUpdate(sql);
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        InsertTable();
        //UpdateTable();
        //DeleteTable();
    }
}
