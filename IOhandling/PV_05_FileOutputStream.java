import java.io.*;

public class PV_05_FileOutputStream {
    public static void main(String[] args)throws IOException {
        FileOutputStream fo = new FileOutputStream("G:/Paras.txt", true);

        String name = "\nParasChutiyaNahiHai";

        char ar[] = name.toCharArray();

        for(int i = 0; i<name.length(); i++){
             fo.write(ar[i]);
        }

        fo.close();
    }
}

