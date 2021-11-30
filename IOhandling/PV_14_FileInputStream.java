import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PV_14_FileInputStream {
    public static void main(String[] args)throws FileNotFoundException{
        
        try{
            int i;
            FileInputStream fo = new FileInputStream("G:Satish.txt");
            do{
                i = fo.read();
                if(i!=-1){
                    System.out.print((char)i);
                }
            }while(i!=-1);
    
            fo.close();
        }
        catch(Exception e){
            System.out.println("Connot find your file in this system or Please check your path properly");
            System.out.println(e);
        }
        

    }
}
