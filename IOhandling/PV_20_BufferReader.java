import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PV_20_BufferReader {
    public static void main(String[] args) throws IOException{
        int i;
        FileReader fr = new FileReader("G:\\Example.txt");
        BufferedReader br = new BufferedReader(fr);

        do{
            i = fr.read();
            if(i!=-1){
                System.out.print((char)i);
            }
        }while(i!=-1);
        br.close();

    }
}
