import java.util.Scanner;
class PV_49_Exeception {
    public static void main(String[] args) {
        int var1, var2, ans1, ans2, ans3, ans4;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        var1 = sc.nextInt();
        try {
            System.out.println("Enter second number");
            var2 = sc.nextInt();  
        } catch (Exception e) {
            System.out.println("You enterred wrong number");
            System.out.println(e);
        }

        ans1 = var1 + var2;
        ans2 = var1 - var2;
        ans3 = var1 * var2;
        try {
            ans4 = var1 / var2;
            
        } catch (Exception e) {
            System.out.println("Please enter valid number:");
            System.out.println(e);
        }
    }
}
