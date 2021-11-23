import java.util.Scanner;

public class CH_5_Practice_set {

    public static void main(String[] args) {
        
        // Problem 1
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the no of rows");
        // int row = sc.nextInt();
        // for(int i = 0; i < row; i++){
        //     for(int j = 0; j<=row-i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("\n");
        // }

        // Problem 2
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the n term of even no:");
        // int n = sc.nextInt();
        // int i = 0, sum = 0;
        // while (i<=n) {
        //     sum = sum + i;
        //     i = i+2;
        // }
        // System.out.println(sum);
        
        // Problem 3
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number which you want to table of:");
        // int n = sc.nextInt();
        // for(int i = 1; i<=10; i++){
        //     System.out.println(n+"X"+i+"="+ n*i);
        // }

        //Problem 4
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number which you want to table in reverse:");
        // int n = sc.nextInt();
        // for(int i = 10; i>=1; i--){
        //     System.out.println(n+"X"+i+"="+ n*i);
        // }

        // Problem 5
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number to find factorial:");
        // int n = sc.nextInt();
        // int fact = 1;
        // for(int i = 1; i<=n; i++){
        //     fact = fact * i;
        // }
        // System.out.println("Factoirial is:"+fact);

        //Problem 7
        // int n = 5;
        // int i = 1;
        // while(i<=5){
        //      System.out.println(n);
        //      i++;
        // }

        // Problem 8
        // int n = 5;
        // int i = 1;
        // while(i<=5){
        //      System.out.println(n);
        //      i++;
        // }
        // int k = 1;
        // for(int j = 1; j<=3; j++){
        //     System.out.println("3");
        // }

        // Problem 9
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number to print the sum of all is table:");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<= 10; i++){
            sum = sum + (n*i);
        }
        System.out.println("Sum of table is:"+sum);

        

        

    }
}
