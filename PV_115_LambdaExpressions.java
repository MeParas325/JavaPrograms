@FunctionalInterface
interface myInterface{
    public void meth1(int a, String b);
}
public class PV_115_LambdaExpressions {
    public static void main(String[] args) {
        //Lambda Expressions
        myInterface obj = (str, a) ->{
            System.out.println("I am the method 1 of lambda Expressions:"+a+" "+str);
        };
        obj.meth1(3, "Paras");
    };
}

