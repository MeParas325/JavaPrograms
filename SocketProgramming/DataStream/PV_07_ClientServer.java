import java.io.*;
import java.net.*;
import java.util.Scanner;

public class PV_07_ClientServer{

        public static void main(String[] args) {
        try{
             ServerSocket ss = new ServerSocket(6969);
             Socket sc = ss.accept();
             DataInputStream ds = new DataInputStream(sc.getInputStream());
             String strr = (String)ds.readUTF();
             System.out.println(strr);
             sc.close();
             ss.close();

             Socket scc = new Socket("Localhost", 6969);
             DataOutputStream dos = new DataOutputStream(scc.getOutputStream());
             Scanner scr = new Scanner(System.in);
             String str = scr.nextLine();
             dos.writeUTF(str);
             dos.flush();
             dos.close();
             scc.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}