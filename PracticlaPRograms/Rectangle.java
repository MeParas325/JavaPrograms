import java.util.Scanner;
public class Rectangle{
    Rectangle(int length, int breath){
        System.out.println("Area is:"+length*breath);
    }
    static public void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        int length = sc.nextInt();
        System.out.println("Enter the breath of the rectangle:");
        int breath = sc.nextInt();

        Rectangle rc = new Rectangle(length, breath);
    }
}