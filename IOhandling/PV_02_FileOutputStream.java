import java.io.*;
import java.util.Scanner;

public class PV_02_FileOutputStream {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        FileOutputStream fo = new FileOutputStream("./Paras.txt");

        String name = sc.nextLine();

        char ar[] = name.toCharArray();

        for(int i = 0; i<name.length(); i++){
             fo.write(ar[i]);
        }

        fo.close();
        sc.close();

        int i;
        FileInputStream fin = new FileInputStream(".\\Paras.txt");

        do{
            i = fin.read();
            if(i!=-1){
                System.out.print((char)(i));
            }
        }while(i!=-1);
        fin.close();
    }
}
