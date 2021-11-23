import java.io.DataInput;
import java.io.DataOutputStream;
import java.io.IOException;

public class PV_11_Streams {
    public static void main(String[] args) throws IOException {
       DataOutputStream dos = new DataOutputStream("D:\\JavaVs\\IOhandling\\Paras.txt");
       dos.write(97);
       dos.close();
    }
}
