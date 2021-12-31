import java.sql.*;

public class App{
    public static void main(String args[])throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con_college = DriverManager.getConnection("jdbc.mysql.//localhost/College", "Paras verma", "bca@123");
        Statement stmt = con_college.createStatement();
        ResultSet rs = stmt.executeQuery("Select * from student");
        while(rs.next()){
            System.out.println(rs.getString(0) + "-"+rs.getString(1)+ "-"+ rs.getString(2));
        }
    }
}
