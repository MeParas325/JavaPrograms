public class PV_06_LCM {
    static int gcd(int a, int b){
        return a%b == 0 ? b: gcd(b, a%b);
    }
    public static void main(String args[]){
        int a = 14;
        int b = 7;
        int gcd = gcd(a, b);

        System.out.println("LCM of two numbers is:" +(a*b)/gcd);
    }
    
}