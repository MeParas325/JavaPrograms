import java.io.*;
public class PV_01_FileHandling{
    public static void main(String[] args) throws IOException{
        File f1 = new File("D:\\JAVAPROG\\Example.txt");
        System.out.println("Is exist:"+f1.exists());
        f1.createNewFile();
        // f1.delete();
        System.out.println("Is exist:"+f1.exists());
        System.out.println("Can Read File:"+f1.canRead());
        System.out.println("File size:"+f1.length());
        System.out.println("File Name is:"+f1.getName());
        f1.delete();
        System.out.println("Is exist:"+f1.exists());
    };
}