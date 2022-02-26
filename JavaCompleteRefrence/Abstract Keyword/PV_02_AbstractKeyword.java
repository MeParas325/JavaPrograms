abstract class Abstract2{
    void meth1(){
        System.out.println("I am the method of abstract class.");
    }
    abstract void meth2();
    // void meth3(); //You cannot do this if you want to declare a method without body you have to use abstract keyword and only 1 abstract method makes a whole class abstract
    
}

public class PV_02_AbstractKeyword extends Abstract2{
    void meth2(){
        System.out.println("I ma the meth2 of the main class.");
    }

    void meth1(){
        System.out.println("I am the meth1 of main class.");
    }

    public static void main(String argsp[]){
        PV_02_AbstractKeyword obj = new PV_02_AbstractKeyword();
        obj.meth1();
        obj.meth2();


        
    }
}