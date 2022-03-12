interface C{
    default void reset(){
        System.out.println("I am the reset method of A interface.");
    }
}

interface D{
    default void reset(){
        System.out.println("I am the reset method of B interface.");
    }
}


public class PV_02_MultipleInheritanceInterfaces implements D, C{
    public void reset(){
        D.super.reset();
        System.out.println("I am the method of main class.");
    }
    public static void main(String ars[]){
        PV_02_MultipleInheritanceInterfaces obj = new PV_02_MultipleInheritanceInterfaces();
        obj.reset();

    }
}