package Tannu.paras.friends;
import java.util.Scanner;
public class Cylinder{
    Scanner sc = new Scanner(System.in);
    public int area;
    public int volume;

    public void getSet(){
        System.out.println("Enter the area of cylinder:");
        area = sc.nextInt();
    }

    public void area(){
        System.out.println("Area of Cylinder is:"+area);
    }

}
