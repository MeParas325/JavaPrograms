import java.util.Scanner;
public class CH_7_Methods {
    static void Multiply(int n){
        for (int i = 1; i<=10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n*i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print the table:");
        int no = sc.nextInt();
        Multiply(no);
    }
}
