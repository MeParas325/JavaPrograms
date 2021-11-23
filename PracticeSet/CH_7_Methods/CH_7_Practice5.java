import java.util.Scanner;
class CH_7_Practice5{
    static int count=1;
    static void Repeat(int n){
        if(count==n){
            return;
        }
            System.out.println(n);
            count++;
            Repeat(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int no = sc.nextInt();
        Repeat(no);
    }
    
}
