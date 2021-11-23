package Tannu.paras.friends;
import java.util.Scanner;
public class Sphere{
    Scanner sc = new Scanner(System.in);
    public int area;
    public int volume;

    public void getSet(){
        System.out.println("Enter the sphere of rectangle:");
        area = sc.nextInt();
    }

    public void area(){
        System.out.println("Area of sphere is:"+area);
    }

}