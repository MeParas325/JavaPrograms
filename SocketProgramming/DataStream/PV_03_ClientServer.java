import java.io.DataInputStream;
import java.net.*;

public class PV_03_ClientServer{

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
    }
}