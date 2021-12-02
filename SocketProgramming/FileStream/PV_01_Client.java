import java.io.*;
import java.net.*;
public class PV_01_Client{
    public static void main(String args[]){
        try{
            Socket sc = new Socket("192.168.151.54", 6969);
            FileOutputStream ds = new FileOutputStream(sc.getOutputStream());
            ds.writeUTF("Hello How are you");
            ds.flush();
            ds.close();
            sc.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}