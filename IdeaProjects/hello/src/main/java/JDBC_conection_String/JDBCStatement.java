package JDBC_conection_String;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCStatement {
    public static void main(String[] args) {
        try {
            Connection connection = TestJDBCConection.getJDBCConnection();
            Statement statement = connection.createStatement();

            String sql = "select * from lophoc";

            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                String malh = rs.getString("malh");
                String tenlh = rs.getString("tenlh");
                int sl = rs.getInt("soluonglh");
                System.out.println(malh + " " + tenlh + " " + sl);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
