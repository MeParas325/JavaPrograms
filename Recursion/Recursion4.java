import java.util.Scanner;
public class Recursion4{
    public static void printSum(int i, int n, int sum){
        if(i == n+1){
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1, n, sum);
    }
    static public void main(String args[]){
        System.out.println("Enter the nth term you want to print the sum of the numbers:");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        printSum(1, n, sum);
        sc.close();
    }
}