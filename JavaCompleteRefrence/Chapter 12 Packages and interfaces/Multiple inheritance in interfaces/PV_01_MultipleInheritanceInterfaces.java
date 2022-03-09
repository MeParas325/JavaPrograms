import java.security.DrbgParameters.Reseed;

interface A{
    default void reset(){
        System.out.println("I am the reset method of A interface.");
    }
}

interface B extends A{
    default void reset(){
        System.out.println("I am the reset method of B interface.");
    }
}


public class PV_01_MultipleInheritanceInterfaces implements B{
    public void reset(){
        System.out.println("I am the method of main class.");
    }
    public static void main(String ars[]){
        PV_01_MultipleInheritanceInterfaces obj = new PV_01_MultipleInheritanceInterfaces();
        obj.reset();

    }
}