abstract class Abstract1{
    void meth1(){
        System.out.println("I am the method of abstract class.");
    }
    abstract void meth2();
    // void meth3(); //You cannot do this if you want to declare a method without body you have to use abstract keyword and only 1 abstract method makes a whole class abstract
    
}

public class PV_01_AbstractKeyword extends Abstract1{
    void meth2(){
        System.out.println("I ma the meth2 of the main class.");
    }

    public static void main(String argsp[]){
        PV_01_AbstractKeyword obj = new PV_01_AbstractKeyword();
        obj.meth2();

        
    }
}