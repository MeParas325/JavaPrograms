// This algorithm is used to find the largest divisible number which can divide both the integers
public class PV_05_GCD {
    static int gcd(int a, int b){
        return a%b == 0 ? b: gcd(b, a%b);
    }
    public static void main(String args[]){
        System.out.println("GCD is:"+gcd(15, 30));
    }
    
}
