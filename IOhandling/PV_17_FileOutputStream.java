import java.io.*;

public class PV_17_FileOutputStream {
    public static void main(String[] args)throws IOException {
        //If you run this program this will show a runtime error ; "Access is denied " because you are trying to make file in C drive
        FileOutputStream fo = new FileOutputStream("C:\\Paras.txt");

        String name = "Tannuja";

        char ar[] = name.toCharArray();

        for(int i = 0; i<name.length(); i++){
             fo.write(ar[i]);
        }

        fo.close();
    }
}
