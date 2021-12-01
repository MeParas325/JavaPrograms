import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;

public class PV_18_BufferWriter {
    public static void main(String[] args) throws IOException{
        BufferedWriter bf = new BufferedWriter(new FileWriter("G:\\Example.txt", true));

        bf.write(" and i dont know what to say");
        bf.close();

    }
}
