import java.io.*;
import java.net.*;

public class PV_06_MultiClientServer{
        public static void main(String[] args) {
        try{
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
         try{
                Socket st = new Socket("localhost", 6969);
                DataOutputStream do = new DataOutputStream(st.getOutputStream());
                do.writeUTF("Hello How are you");
                do.flush();
                do.close();
                st.close();
            }
            catch(Exception e){
                System.out.println(e);
            }
    }
}