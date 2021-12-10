import java.io.*;
import java.util.Scanner;
import java.net.*;

public class PV_11_ClientServer{
    static public void main(String args[]){
        Boolean bol = true;
        while(bol){
            try{
                    ServerSocket ss = new ServerSocket(6969);
                    Socket s = ss.accept();
                    DataInputStream dis = new DataInputStream(s.getInputStream());
                    String strr = (String)dis.readUTF();
                    System.out.println("Message from your friend:");
                    System.out.println(strr);
                    s.close();
                    ss.close();
        
                    Socket sk = new Socket("Localhost", 6062);
                    DataOutputStream dos = new DataOutputStream(sk.getOutputStream());
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the message for your friend:");
                    String str = sc.nextLine();
                    dos.writeUTF(str);
                    dos.flush();
                    sk.close();
                    // sc.close();
                }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}