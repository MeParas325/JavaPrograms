import java.util.Scanner;

public class Calc{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt(); 

        System.out.println("Enter your choice");
        System.out.println("1:Add");
        System.out.println("2:Sub");
        System.out.println("3:Mul");
        System.out.println("4:Div");
        System.out.println("5:Mod");
        int choice = sc.nextInt();

        if(choice == 1){
            System.out.println("Addition is:");
            System.out.println(a+b);
        }
        else if(choice == 2){
            System.out.println("Subtraction is:");
            System.out.println(a-b);
        }
        else if(choice == 3){
            System.out.println("Multiplication is:");
            System.out.println(a*b);
        }
        else if(choice == 4){
            System.out.println("Division is:");
            System.out.println(a/b);
        }
        else if(choice == 5){
            System.out.println("Modulos is:");
            System.out.println(a%b);
        }
        else{
            System.out.println("Wrong Choice!");
        }
    }
}