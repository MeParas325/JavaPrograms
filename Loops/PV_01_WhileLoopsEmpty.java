import java.util.Scanner;
public class PV_01_WhileLoopsEmpty{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int first = sc.nextInt();

        System.out.println("Enter the second number:");
        int second = sc.nextInt();

        System.out.println("MidPoint is:"+(first+second)/2.0);

        while(++first<--second);

        System.out.println("MidPoint using while loops:"+first);

    }
}