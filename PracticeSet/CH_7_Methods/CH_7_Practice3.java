import java.util.Scanner;
public class CH_7_Practice3 {
    static int sum(int n){
        if(n == 1){
            return 1;
        }
        else if(n<=0){
            System.out.println("Invalid number Entered by user.");
        }
        else{
            return n + sum(n-1);
        }

        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n natural number:");
        int no = sc.nextInt();
        System.out.println("Sum is:"+sum(no));
    }
}
