import java.util.Scanner;
public class Recursion3{
    public static void printNum(int n, int m){
        if(n == m+1){
            return ;
        }
        System.out.println(n);
        printNum(n+1, m);

    }
    static public void main(String args[]){
         int no;
         System.out.println("Enter the n th term of the natural numbers:");
         Scanner sc = new Scanner(System.in);
         no = sc.nextInt();
         printNum(1, no);
         sc.close();
    }
}