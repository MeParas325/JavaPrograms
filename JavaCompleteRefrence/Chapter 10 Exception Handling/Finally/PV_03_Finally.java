import java.io.FileInputStream;
import java.io.IOException;

public class PV_03_Finally {
    public static void main(String args[])throws IOException{
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("Tannu.txt");
        }
        catch(Exception e){
            System.out.println("File not found.");
        }
        finally{
            if(fis!=null){
                fis.close();
            }
            System.out.println("File is closed.");
        }
    }
    
}
