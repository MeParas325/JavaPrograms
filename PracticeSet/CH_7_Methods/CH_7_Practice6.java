import java.util.Scanner;
class CH_7_Practice6 {
    static void Fibonacci(int n){
        int first=0;
        int second = 1;
        System.out.print(first+" "+second+" ");
        for(int i = 3; i<=n; i++){
            int next = first + second;
            System.out.print(next+" ");
            first = second;
            second = next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n th term of fibonacci series:");
        int term = sc.nextInt();
        Fibonacci(term);
    }
}
