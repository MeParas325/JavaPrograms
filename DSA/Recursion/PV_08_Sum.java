public class PV_08_Sum {
    public static int sum1(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n + sum1(n-1);
        }
    }
    static public void main(String args[]){
        System.out.println(sum1(10));
    }
}
