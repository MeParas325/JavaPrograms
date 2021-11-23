import java.util.Scanner;
class Student{
    static int [] marks = new int[5];
    static int roll_no;
    static String name;
    static String course;
    static int avg;
    static int sum;
    static int i;

    public static void Details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter course: ");
        course = sc.nextLine();
        System.out.println("Enter roll_no");
        roll_no = sc.nextInt();
        for(i = 0; i<5; i++){
            System.out.format("Enter %d Subject mark:", i+1);
            marks[i] = sc.nextInt();
        }
        for(i = 0; i<5; i++){
            sum = sum + marks[i];
        }
        avg = sum/5;
        System.out.println("Name is:"+name);
        System.out.format("Average is %d:\n", avg);
        System.out.println("Course is:"+ course);
        System.out.println("Roll_no is:"+avg);
        for(i =0; i<5; i++){
            System.out.format("Marks of %d Subject is %d\n", i+1, marks[i]);
        }
    }
}
class PV_11_Percentage{
    public static void main(String[] args) {
        Student.Details();
    }
}