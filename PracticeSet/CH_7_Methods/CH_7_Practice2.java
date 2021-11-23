import java.util.Scanner;
public class CH_7_Practice2 {
    static void Pattern(int n){
          for(int i = 0; i<n; i++){
              for(int j = 0; j<=i; j++){
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
