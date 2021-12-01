import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PV_21_BufferReader {
    public static void main(String[] args) throws IOException{
        int i;
        BufferedReader br = new BufferedReader(new FileReader("G:\\Example.txt"));

        do{
            i = br.read();
            if(i!=-1){
                System.out.print((char)i);
            }
        }while(i!=-1);
        br.close();

    }
}
