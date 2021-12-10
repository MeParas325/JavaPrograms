import java.io.*;
import java.util.Scanner;
import java.net.*;

public class PV_12_ClientServer{
    static public void main(String args[]){
        while(true){
            try{
                    Socket sk = new Socket("Localhost", 6060);
                    DataOutputStream dos = new DataOutputStream(sk.getOutputStream());
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the message for your friend:");
                    String strr = sc.nextLine();
                    dos.writeUTF(strr);
                    dos.flush();
                    sk.close();
                    // sc.close();
    
                    ServerSocket ss = new ServerSocket(6061);
                    Socket s = ss.accept();
                    DataInputStream dis = new DataInputStream(s.getInputStream());
                    String str = (String)dis.readUTF();
                    System.out.println("Message from your friend:");
                    System.out.println(str);
                    s.close();
                    ss.close();
                }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}