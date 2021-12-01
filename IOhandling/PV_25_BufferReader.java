import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PV_25_BufferReader {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("G:\\Example.txt"));

        char s[] = new char[70];
        try{
            br.read(s, 0, 50);
            System.out.println(s);
    
            br.close();
        }
        catch(Exception e){
            System.out.println("Error aa gya bhai index dekh sahi daala hai ya ni tune");
            System.out.println(e);
        }
    }
}


