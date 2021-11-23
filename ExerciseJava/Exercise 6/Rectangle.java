package Tannu.paras.friends;
import java.util.Scanner;
public class Rectangle{
    Scanner sc = new Scanner(System.in);
    public int area;
    public int volume;

    public void getSet(){
        System.out.println("Enter the area of rectangle:");
        area = sc.nextInt();
    }

    public void area(){
        System.out.println("Area of Reatangle is:"+area);
    }

}