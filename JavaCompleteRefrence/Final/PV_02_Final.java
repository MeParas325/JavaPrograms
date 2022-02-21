public class PV_02_Final{
    final static int a = 10;
    final int b = 20;

    static void meth(){
        System.out.println(a);
        // a = 20*a; //This will also give you an error you cannot change the value of a 
        System.out.println("After changing the value of a:"+a);
    }

    void meth2(){
        System.out.println(b);
    }
    public static void main(String args[]){
        final int a = 0;
        // a = 10; //This line give you an error you cannot change the value of final keyword because it is declared final
        System.out.println(a);

        PV_02_Final obj = new PV_02_Final();
        meth();
        obj.meth2();

        System.out.println("Value of b:"+obj.b);
        // obj.b = 20; //This line also give you an error because you are trying to change the value of b which is already declared final
        System.out.println("Value of b after changing it:"+obj.b);
    }

}