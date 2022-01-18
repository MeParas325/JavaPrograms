import java.util.Scanner;
class Recursion6 {
    public static int printFact(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int factNum = printFact(n-1);
        int fact_n = n*factNum;
        return fact_n;
    }
    static public void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.println("Enter the number you want to find the factorial:");
        int n = sc.nextInt();
        fact = printFact(n);
        System.out.println(fact);
        sc.close();
    }
}
