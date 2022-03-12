interface A{
    void meth1();
    void meth2();
}

interface B extends A{
    void meth3();
}

public class PV_01_ExtendedInterface implements B{
    public void meth3(){
        System.out.println("I am method 3");
    }
    public void meth2(){
        System.out.println("I am method 2");
    }
    public void meth1(){
        System.out.println("I am method 1");
    }
    public static void main(String arhs[]){
        B obj = new PV_01_ExtendedInterface();
        obj.meth1();
        obj.meth2();
        obj.meth3();

    }
}