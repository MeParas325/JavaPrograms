interface Methodd{
    public void meth1();
    public void meth2();
    public void meth3();
}

abstract class MyClass implements Methodd{
     
    public void meth1(){
        System.out.println("I am the methd 1 of MyClass");
    }
    public void meth2(){
        System.out.println("I am the methd 2 of MyClass");
    }
    public void meth3(){
        System.out.println("I am the methd 3 of MyClass");
    }
    
    abstract void MyAbstractMEth();
}

class PV_Abstract_nterface extends MyClass{
    public void meth3(){
        System.out.println("I am the method of PV_Abstract_Class.");
    }

    public void MyAbstractMEth(){
        System.out.println("Abstract method");
    }
    public static void main(String[] args) {
        PV_Abstract_nterface obj = new PV_Abstract_nterface();
        obj.meth3();
        obj.MyAbstractMEth();
    }
}