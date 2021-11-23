import java.util.Scanner; 
public class PV_05_TakeInput {
 

    public static void main(String[] args) {
       System.out.println("Take 2 numbers from user");
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter first number");
       int a = sc.nextInt();
    //    float a = sc.nextFloat();
       System.out.println("Enter second number");
       int b = sc.nextInt();
    //    float b = sc.nextFloat();
       float sum = a + b;
       System.out.print("The sum is:");
       System.out.println(sum);
    //    String str = sc.next();
    //    String str = sc.nextLine();
    //    System.out.println(str);
    //    boolean b1 = sc.hasNextInt();
    //    System.out.println(b1);
    }
    
}


