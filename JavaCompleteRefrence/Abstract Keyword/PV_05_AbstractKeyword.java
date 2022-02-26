abstract class Abstract5{
    void meth1(){
        System.out.println("I am the method of abstract class.");
    }
    abstract void meth2();
    abstract void meth3();
    abstract void meth4();
    // void meth3(); //You cannot do this if you want to declare a method without body you have to use abstract keyword and only 1 abstract method makes a whole class abstract
    
}

abstract class Abstract6 extends Abstract5{
    void meth2(){
        System.out.println("I am the method 2 of the abstract6 class.");
    }
}



public class PV_05_AbstractKeyword extends Abstract6{
    void meth4(){
        System.out.println("I am the method 4 of main class.");
    }

    void meth3(){
        System.out.println("I am the method 3 of main class.");

    }

    void meth2(){
        System.out.println("I ma the meth2 of the main class.");
    }

    void meth1(){
        super.meth1();
        System.out.println("I am the meth1 of main class.");
    }

    public static void main(String argsp[]){
        Abstract5 obj = new PV_05_AbstractKeyword();
        obj.meth1();
        obj.meth2();
    }
}