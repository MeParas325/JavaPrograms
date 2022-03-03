class ParentClass12{
    synchronized void show(){
        System.out.println("I am the show method of parentclass 10.");
    }
}

public class PV_21_MethodOverriding extends ParentClass12{
    strictfp void show(){
        System.out.println("Method of main class.");
    }
    static public void main(String arhgs[]){
        PV_21_MethodOverriding obj = new PV_21_MethodOverriding();
        obj.show();

        //this program will give you an error

    }
}
