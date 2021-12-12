import java.util.Scanner;
public class Problem6{
    static float SI;
    float amount;
    Problem6(float p, float r, int t){
        SI = (p*r*t)/100;
        System.out.println("SI:"+SI);
    }

    Problem6(float p){
        amount = p + SI;
        System.out.println("Amount is:"+amount);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle");
        float p = sc.nextFloat();

        System.out.println("Enter the value of R:");
        float r = sc.nextFloat();

        System.out.println("Enter the value of T");
        int t = sc.nextInt();

        Problem6 obj = new Problem6(p, r, t);

        Problem6 obj2 = new Problem6(p);
    }
}