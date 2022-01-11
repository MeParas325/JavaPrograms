public class Recursion1{
    public static void printNum(int n){
        if(n == 0){
            return ;
        }
        System.out.println(n);
        printNum(n-1);

    }
    static public void main(String args[]){
         printNum(6);
    }
}