import java.util.Scanner;
import java.io.*;
import java.net.*;
public class PV_09_ClientServer{
    static public void main(String args[]){
        try{
            while(true){
                ServerSocket ss = new ServerSocket(6969);
                Socket sc = ss.accept();
                DataInputStream di = new DataInputStream(sc.getInputStream());
                String str = (String)(di.readUTF());
                System.out.println(str);
                di.close();
                sc.close();
    
                Socket scr = new Socket("Localhost", 6968);
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
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}