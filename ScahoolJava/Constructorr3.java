import java.util.Scanner;
class Test{
    Test(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        int ans = a * b;
        System.out.println("Multiplication is:"+ ans);

    }
    Test(int i, String name){
        System.out.println(name + i);
    }
    Test(int i, int j, int k){
        int ans = i + j + k;
        System.out.println(ans);
    }

}
public class Constructorr3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 45;
        int num2 = 45;
        int num3 = 45;
        Test t1 = new Test();
        Test t2 = new Test(23, "Paras");
        Test t3 = new Test(num1, num2, num3);
    }
}
    
