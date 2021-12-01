import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PV_23_BufferReader {
    public static void main(String[] args) throws IOException{
        int i;
        BufferedReader br = new BufferedReader(new FileReader("G:\\Example.txt"));

        String s = br.readLine();
        System.out.println(s);
        br.close();

    }
}
