// package ExerciseJava;
import java.util.Scanner;


public class Percentage {
    public static void main(String[] args) {

        System.out.println("Enter the marks of 5 subjects:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 1 st subject");
        float a = sc.nextFloat();
        System.out.println("Enter the marks of 2 nd subject");
        float b = sc.nextFloat();
        System.out.println("Enter the marks of 3 rd subject");
        float c = sc.nextFloat();
        System.out.println("Enter the marks of 4 th subject");
        float d = sc.nextFloat();
        System.out.println("Enter the marks of 5 th subject");
        float e = sc.nextFloat();
        float Percentage = ((a+b+c+d+e)/500) * 100;
        System.out.println("The Percentage is:"+Percentage);
    }
}