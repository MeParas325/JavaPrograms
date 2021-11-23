import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
             System.out.println("Enter course name of student:");
             String course = sc.next();
            //  sc.nextLine();

             System.out.println("Enter name of student:");
             String name = sc.next();

             System.out.println("Enter sem of student:");
             int sem = sc.nextInt();

             System.out.println("Enter gender of student:");
             char gen = sc.next().charAt(0);

             System.out.println("Enter the age of student");
             int age = sc.nextInt();

             System.out.println("Name is:"+name);
             System.out.println("Age is:" +age);
             System.out.println("Gender is:" +gen);
             System.out.println("Course is:" +course);
             System.out.println("Sem is:" +sem);
             

    }
}
