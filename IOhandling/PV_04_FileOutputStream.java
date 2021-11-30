import java.io.*;

public class PV_04_FileOutputStream {
    public static void main(String[] args)throws IOException {
        FileOutputStream fo = new FileOutputStream("G:/Paras.txt");

        String name = "Paras";

        char ar[] = name.toCharArray();

        for(int i = 0; i<name.length(); i++){
             fo.write(ar[i]);
        }

        fo.close();
    }
}
