import java.util.Scanner;
public class CH_7_Practice4 {
    static void Pattern(int n){
          for(int i = n; i>0; i--){
              for(int j = 1; j<=i; j++){
                  System.out.print("*");
              }
              System.out.println("\n ");
          }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.format("Enter the number to print star pattern:");
        int no = sc.nextInt();
        Pattern(no);
    }
}

