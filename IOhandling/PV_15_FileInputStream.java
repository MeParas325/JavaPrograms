import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PV_15_FileInputStream {
    public static void main(String[] args) throws FileNotFoundException{
            int i;
            FileInputStream fo = new FileInputStream("G:Example.txt");
            try{
                do{
                    i = fo.read();
                    if(i!=-1){
                        System.out.print((char)i);
                    }
                }while(i!=-1);
                fo.close();
            }
            catch(Exception e){
                System.out.println("Exception occurs");
                System.out.println(e);
            }
        }
    }
