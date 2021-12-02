import java.io.*;
import java.net.*;

public class PV_05_MultClientServer{
        public static void main(String[] args) {
        try{
            try{
                Socket sc = new Socket("localhost", 6969);
                DataOutputStream ds = new DataOutputStream(sc.getOutputStream());
                ds.writeUTF("Hello How are you");
                ds.flush();
                ds.close();
                sc.close();
            }
            catch(Exception e){
                System.out.println(e);
            }
             ServerSocket ss = new ServerSocket(6969);
             Socket sc = ss.accept();
             DataInputStream ds = new DataInputStream(sc.getInputStream());
             String str = (String)ds.readUTF();
             System.out.println(str);
             sc.close();
             ss.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}