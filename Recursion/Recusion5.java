import java.util.Scanner;
public class Recusion5 {
    public static void printFact(int n, int fact){
        if(n == 1 || n == 0){
            System.out.println(fact);
            return ;
        }
        fact = fact*n;
        printFact(n-1, fact);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.println("Enter the number you want to find the factorial:");
        int n = sc.nextInt();
        printFact(n, fact);
        sc.close();
    }
}
