import java.util.Scanner;

public class PV_01_NoOfTrailingZeroFactorial{
    static public void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int no = sc.nextInt();

        int result = 0;

        for(int i = 5; i<=no; i*=5){
            result = result + no/i;
        }

        System.out.println("No of trailing zero in this factorial is:"+result);

    }
}