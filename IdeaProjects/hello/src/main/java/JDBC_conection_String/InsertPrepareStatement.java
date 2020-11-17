package JDBC_conection_String;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPrepareStatement {
    public static  void InsertRecords (String magv, String tengv){
        Connection connection = TestJDBCConection.getJDBCConnection();
        String sql = "insert into giangvien(magv,tengv) values(?,?) ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,magv);
            preparedStatement.setString(2,tengv);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static  void UpdateRecords (String magv, String tengv){
        Connection connection = TestJDBCConection.getJDBCConnection();
        String sql = "update  giangvien set tengv = ? where magv = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,tengv);
            preparedStatement.setString(2,magv);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static  void DeleteRecords (String magv){
        Connection connection = TestJDBCConection.getJDBCConnection();
        String sql = "delete from  giangvien where magv = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,magv);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        //InsertRecords("gv4","hanh");
        UpdateRecords("gv2","huy");
        //DeleteRecords("gv1");
    }
}
