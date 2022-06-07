// This algorithm is used to find the largest divisible number which can divide both the integers
public class PV_03_GCD {
    static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    public static void main(String args[]){
        System.out.println("GCD is:"+gcd(12, 14));
    }
    
}
