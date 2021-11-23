abstract class MyAbstract{
    public void start(){
        System.out.println("Starting thr abstract method");
    }

    abstract void MyMeth();
}

interface MyInterface{
    int a = 34;
    public void sum();
    default void data(){
        System.out.println("We are not able to find the nextData for yours");
    }

    // static void run(){
    //     System.out.println("Running the method of static interface");
    // }

    // private int meth1(){
    //     System.out.println("Running the method1 of MyInterface");
    // }
}
class MyClass extends MyAbstract implements MyInterface{
    int i = 343;
    public void MyMeth(){
        data();
        // run();
        // meth1();
        System.out.println(" I am the method of MYClass");
    }

    public void sum(){
        System.out.println("I print the sum of MyClass And thank you for giving me this opportunities");
    }


}

class Derived extends MyClass{
    int id = 48;
    public void der(){
        System.out.println(i);
        System.out.println(" I am the method of derived class");
    }
}

class PV_Abstract{
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.start();
        Derived obj2 = new Derived();
        obj2.der();
        System.out.println(obj2.id);
        System.out.println(obj2.i);
        obj.sum();
        System.out.println(obj.a);
        // obj.a = 344;  //This value is final thats why yo cannot change it
        // System.out.println(obj.a);
    }
}