public class Recursion2{
    public static void printNum(int n){
        if(n == 7){
            return ;
        }
        System.out.println(n);
        printNum(n+1);

    }
    static public void main(String args[]){
         int n = 1;
         printNum(n);
    }
}