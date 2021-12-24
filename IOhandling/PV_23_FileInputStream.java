import java.util.Scanner;
import java.io.*;
public class PV_23_FileInputStream {
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);

        File f = new File("./Paras.txt");
        FileOutputStream fs = new FileOutputStream(f);

        System.out.println("Enter the name of the student:");
        String name = sc.nextLine();
        String studentName = "Name of the Student:"+name+"\n";
        char ar[] = studentName.toCharArray();
        for(int i = 0; i<ar.length; i++){
            fs.write(ar[i]);
        }

        System.out.println("Enter the student id of the student:");
        String studentId = sc.nextLine();
        String studentIdStr = "Id of the Student:"+studentId+"\n";
        char arr2[] = studentIdStr.toCharArray();
        for(int i = 0; i<arr2.length; i++){
            fs.write(arr2[i]);
        }
        
        System.out.println("Enter the course of the student:");
        String course = sc.nextLine();
        String studentCourse = "Course of the Student:"+course+"\n";
        char arr1[] = studentCourse.toCharArray();
        for(int i = 0; i<arr1.length; i++){
            fs.write(arr1[i]);
        }

        fs.close();

    }
}
