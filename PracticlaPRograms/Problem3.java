import java.util.Scanner;

public class Problem3{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the unit:");
    double unit=sc.nextDouble();
    double bill;

    if(unit<100){
    bill=1.20*unit;
    System.out.println(1.20*unit);
    }
    
    else if(unit<200){
    bill=((100*1.20)+(unit-(100*2)));
    System.out.println(bill);
    }
    
    else if(unit<300){
    bill=((100*1.20)+(unit-(100*2))+(unit-(200+3)));
    System.out.println(bill);
    }
 }

}