import java.util.Scanner;
interface A{
    static int number(int a){
        return a;
    }
}

public class PV_01_StaticMethodInInterfaces{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int a = sc.nextInt();

        System.out.println("Value is:"+A.number(a));
        
    }
}