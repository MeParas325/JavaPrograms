import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return "I am the String";
    }
    
    public String getMessage(){
        return "Getting messages";
    }
    
}

public class PV_83_Exception_Class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        a = sc.nextInt();
        if(a<99){
            try {
                throw new MyException();
                // throw new ArithmeticException("This is an arithmetic exception");
            } catch (Exception e) {
                System.out.println(e);
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Again i am finished");
        }

    }
}
