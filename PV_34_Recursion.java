import java.util.Scanner;
public class PV_34_Recursion {
    static long factorial(int n){
         if(n == 1 || n == 0){
             return 1;
         }
         else if(n < 0){
             return -1;
         }
         else{
             return n*factorial(n-1);
         }
    }
    public static void main(String[] args) {
        long c;   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to know the factorial:");
        int number = sc.nextInt();

        c = factorial(number);
        if(c == -1){
            System.out.println("Please input a valid number");
        }
        else{
            System.out.println("Factorial of "+number+" is:"+c);
        }
    }
}
