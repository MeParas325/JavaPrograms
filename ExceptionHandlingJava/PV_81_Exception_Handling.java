import java.util.InputMismatchException;
import java.util.Scanner;
public class PV_81_Exception_Handling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []marks = new int[3];

        marks[0] = 34;
        marks[1] = 0;
        marks[2] = 88;

        System.out.println("Enter the index of which number you want to divide");
        int index = sc.nextInt();

        System.out.println("Enter the number form which you want to divide the index number");
        int number = sc.nextInt();

        try{
            System.out.println("The index you entered, number is:"+marks[index]);
            System.out.println("The result of divisible is:"+marks[index]/number);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException occurs");
            System.out.println(e);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBondException occurs");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Some exception occurs");
            System.out.println(e);
        }
        
    }
}
