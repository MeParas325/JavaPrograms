final class C{
    int a = 10;
    void meth1(){
        System.out.println("I am the method 1 of a class.");
        System.out.println(a);
    }
}


public class PV_03_FinalOverriding{
    static public void main(String args[]){
        C obj = new C();
        System.out.println(obj.a);
        obj.meth1();
        obj.a = 20;
        System.out.println(obj.a);
        obj.meth1();

    }
}
