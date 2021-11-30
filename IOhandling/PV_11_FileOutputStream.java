import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PV_11_FileOutputStream {
    public static void main(String[] args)throws IOException {
        File fs = new File("G:\\Example.txt");

        FileOutputStream fo = new FileOutputStream(fs, true);

        String name = " is very beautiful for me";

        char ch[] = name.toCharArray();

        for(int i = 0; i<ch.length; i++){
            fo.write(ch[i]);
        }

        fo.close();
    }
}
