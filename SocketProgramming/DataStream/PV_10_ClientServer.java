import java.util.Scanner;
import java.io.*;
import java.net.*;
public class PV_10_ClientServer{
    static public void main(String args[]){
        try{
            while(true){
                Socket scr = new Socket("Localhost", 6969);
                DataOutputStream dos = new DataOutputStream(scr.getOutputStream());
                Scanner scn = new Scanner(System.in);
                System.out.println("Enter the message for you friend:");
                String strr = scn.nextLine();
                if(strr == "Exit" || strr == "exit"){
                    break;
                }
                dos.writeUTF(strr);
                dos.flush();
                dos.close();
                scr.close();
                scn.close();
    
                ServerSocket ss = new ServerSocket(6968);
                Socket sc = ss.accept();
                DataInputStream di = new DataInputStream(sc.getInputStream());
                String str = (String)(di.readUTF());
                System.out.println(str);
                di.close();
                sc.close();
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}