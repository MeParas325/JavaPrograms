import java.io.*;
import java.net.*;
import java.util.Scanner;

public class PV_08_ClientServer{

        public static void main(String[] args) {
        try{
            Socket scc = new Socket("Localhost", 6969);
            DataOutputStream dos = new DataOutputStream(scc.getOutputStream());
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            dos.writeUTF(str);
            dos.flush();
            dos.close();
            scc.close();

            ServerSocket ss = new ServerSocket(6969);
            Socket scr = ss.accept();
            DataInputStream ds = new DataInputStream(scr.getInputStream());
            String strr = (String)ds.readUTF();
            System.out.println(strr);
            scr.close();
            ss.close();

            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}