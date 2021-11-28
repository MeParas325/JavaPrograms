@FunctionalInterface
interface myInterface{
    public void meth1();
}

class ParasFun implements myInterface{
    public void meth1(){
        System.out.println("I am the method 1 of ParasFun Class");
    }
}
public class PV_111_LambdaFunctions {
    public static void main(String[] args) {
        //Lambda Expressions
        myInterface obj = new ParasFun();
        obj.meth1();


    }
}
