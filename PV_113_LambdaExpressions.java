@FunctionalInterface
interface myInterface{
    public void meth1(int a);
}
public class PV_113_LambdaExpressions {
    public static void main(String[] args) {
        //Lambda Expressions
        myInterface obj = (z) ->{
            System.out.println("I am the method 1 of lambda Expressions:"+z);
        };
        obj.meth1(3);
    };
}

