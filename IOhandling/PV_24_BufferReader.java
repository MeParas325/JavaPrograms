import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PV_24_BufferReader {
    public static void main(String[] args) throws IOException{
        int i;
        BufferedReader br = new BufferedReader(new FileReader("G:\\Example.txt"));

        String s;
        do{
            s = br.readLine();
            if(s!=null){
                System.out.println(s);
            }
        }while(s!=null);
        br.close();

    }
}

