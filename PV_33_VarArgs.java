class VarArgs{
    static int sum;
    static int add(int ...arr){
        for(int a: arr){
            sum = sum + a;
        }
        return sum;
    }
}

public class PV_33_VarArgs extends VarArgs{
    public static void main(String[] args) {
        System.out.println(add());
        System.out.println(add(2,3));
        System.out.println(add(2,3,4));
        System.out.println(add(2,3,4,5));
    } 
}
