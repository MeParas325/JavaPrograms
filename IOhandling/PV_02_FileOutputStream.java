import java.io.*;

public class PV_02_FileOutputStream {
    public static void main(String[] args)throws IOException {
        FileOutputStream fo = new FileOutputStream("./Paras.txt");

        String name = "Tannuja";

        char ar[] = name.toCharArray();

        for(int i = 0; i<name.length(); i++){
             fo.write(ar[i]);
        }

        fo.close();
    }
}
