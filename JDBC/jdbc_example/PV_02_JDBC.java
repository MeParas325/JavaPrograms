import java.sql.*;
public class PV_02_JDBC {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception e){
            System.out.println("Exception aa gya hai bhai");
            System.out.println(e);
        }
    }
}
