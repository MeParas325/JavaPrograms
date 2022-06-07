import java.util.Arrays;
import java.util.Scanner;

// This algorithm is used to find the prime numbers between two numbers
public class PV_04_SteiveOfErotoSthenes {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of number:");

        int n = sc.nextInt();
        boolean isPrime[] = isPrimeMeth(n);

        for(int i = 0; i<=n; i++){
            System.out.println(i+" "+isPrime[i]);
        }
    }

    static boolean[] isPrimeMeth(int n){

        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2; i*i<=n ; i++){
            for(int j = i; j<=n; j+=i){
                isPrime[j] = false;
            }
        }
        return isPrime;
    }

}
