import java.io.FileInputStream;
import java.io.IOException;

public class PV_08_FileInputStream {
    public static void main(String[] args) throws IOException{
        int i;
        try{
            FileInputStream fin = new FileInputStream("G:\\Parass.txt");
            do{
                i = fin.read();
                if(i!=-1){
                    System.out.print((char)i);
                }
            }while(i!=-1);
            fin.close();
        }
        catch(Exception e){
            System.out.println("Error aa gya bhai kya krr rha hai yrr tu");
            System.out.println(e);
        }
    }
}

