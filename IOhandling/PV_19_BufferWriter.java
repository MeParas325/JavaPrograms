import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;

public class PV_19_BufferWriter {
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("G:\\Example.txt", true);
        BufferedWriter bf = new BufferedWriter(fw);

        bf.write(".Thats it!");
        bf.close();

    }
}

