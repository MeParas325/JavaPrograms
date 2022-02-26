class A{
    final void meth1(){
        System.out.println("I am the method 1 of a class.");
    }
}


public class PV_01_FinalOverriding extends A{
    // void meth1(){
    //     // super.meth1();
    //     System.out.println("I am the method 1 of main class.");
    // }
    static public void main(String args[]){
        PV_01_FinalOverriding obj = new PV_01_FinalOverriding();
        obj.meth1();

        A obj2 = new PV_01_FinalOverriding();
        obj2.meth1();

        A obj3 = new A();
        obj3.meth1();

    }
}