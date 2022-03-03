class ParentClass11{
    synchronized void show(){
        System.out.println("I am the show method of parentclass 10.");
    }
}

public class PV_20_MethodOverriding extends ParentClass11{
    void show(){
        System.out.println("Method of main class.");
    }
    static public void main(String arhgs[]){
        PV_20_MethodOverriding obj = new PV_20_MethodOverriding();
        obj.show();

    }
}
