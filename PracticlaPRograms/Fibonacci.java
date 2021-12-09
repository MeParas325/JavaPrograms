public class Fibonacci{
    static public void main(String args[]){
        int first = 0, second = 1, next = 0;
        int n = Integer.parseInt(args[0]);
        System.out.print(first+" "+second);
        for(int i = 1; i<n-1; i++){
            next = first+second;
            first = second;
            second = next;
            System.out.print(" "+next);
        }
    }
}