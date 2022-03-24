import java.util.Scanner;
class ThrowException extends RuntimeException{
    ThrowException(String msg){
        super(msg);
    }
}
public class PV_01_Throw{
    public static void main(String args[]){
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        
        if(age>=18){
            System.out.println("You are eligible to vote.");
        }
        else{
            throw new ThrowException("You are not eligible to vote");    
        }

    }
}