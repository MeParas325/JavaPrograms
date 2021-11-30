import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class PV_13_FileInputStream {
    public static void main(String[] args)throws IOException {
        int i;

        File fs = new File("G:\\Example.txt");

        FileInputStream fo = new FileInputStream(fs);

        do{
            i = fo.read();
            if(i!=-1){
                System.out.print((char)i);
            }
        }while(i!=-1);

        fo.close();
    }
}
