interface E{
    default void reset(){
        System.out.println("I am the reset method of E interface.");
    }
}

interface F extends E{
    default void reset(){
        E.super.reset();
        System.out.println("I am the reset method of F interface.");
    }
}

public class PV_03_MultipleInheritanceInterfaces implements F{
    public void reset(){
        F.super.reset();
        System.out.println("I am the method of main class.");
    }
    public static void main(String ars[]){
        PV_03_MultipleInheritanceInterfaces obj = new PV_03_MultipleInheritanceInterfaces();
        obj.reset();
    }
}