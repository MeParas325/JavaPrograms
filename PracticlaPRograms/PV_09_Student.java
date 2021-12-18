import java.util.Scanner;
class Student{
    int roll_no;
    String name;
    static String clg = "GEU";

    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
        System.out.println("Roll no is:"+roll_no);
        System.out.println("Name is:"+name);
        System.out.println("Clg is:"+clg);
    }
}

public class PV_09_Student{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the student:");
        String name = sc.nextLine();
        System.out.println("Enter the roll no of the student:");
        int roll_no = sc.nextInt();

        Student st = new Student(roll_no, name);
    }
}