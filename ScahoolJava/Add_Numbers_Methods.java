import java.util.Scanner;
class Text{
    public int num1;
    public int num2;
    public int ans;

    public void get_val(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        num1 = sc.nextInt();
        System.out.println("Enter second number");
        num2 = sc.nextInt();
    }

    public void cal_cal(){
        ans = num1 + num2;
    }

    public void display(){
        System.out.println(ans);
    }
}
public class Add_Numbers_Methods {
    public static void main(String[] args) {
        Text obj1 = new Text();
        obj1.get_val();
        obj1.cal_cal();
        obj1.display();

    }
}

