import java.io.*;

public class PV_03_FileOutputStream {
    public static void main(String[] args)throws IOException {
        FileOutputStream fo = new FileOutputStream("./Paras.txt", true);

        String name = "Tanuja";

        char ar[] = name.toCharArray();

        for(int i = 0; i<name.length(); i++){
             fo.write(ar[i]);
        }

        fo.close();
    }
}
