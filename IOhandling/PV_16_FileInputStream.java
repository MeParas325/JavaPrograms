import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PV_16_FileInputStream {
    public static void main(String[] args) throws FileNotFoundException, IOException{
            int i;
            FileInputStream fo = new FileInputStream("G:Example.txt");
                do{
                    i = fo.read();
                    if(i!=-1){
                        System.out.print((char)i);
                    }
                }while(i!=-1);
                fo.close();
        }
    }
