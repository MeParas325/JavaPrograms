public class PV_04_VarArgs {
    public static void sum(int i, double j, double ...varAr){
        double sum = 0;
        sum = i+j;
        for(double k : varAr){
            sum += k;
        }
        System.out.println("Sum is:"+sum);
    }
    public static void main(String args[]){
        sum(10, 20.5, 100, 400, 60.5);
    }
}
