import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PV_22_BufferReader {
    public static void main(String[] args) throws IOException{
        try{
            int i;
            BufferedReader br = new BufferedReader(new FileReader("G:\\Exampleee.txt"));
    
            do{
                i = br.read();
                if(i!=-1){
                    System.out.print((char)i);
                }
            }while(i!=-1);
            br.close();
        }
        catch(Exception e){
            System.out.println("Error aa gya bhai kya kr rha hai yrr");
            System.out.println(e);
        }

    }
}
