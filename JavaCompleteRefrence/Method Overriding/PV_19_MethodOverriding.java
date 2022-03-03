class ParentClass10{
    synchronized void show(){
        System.out.println("I am the show method of parentclass 10.");
    }
}

public class PV_19_MethodOverriding extends ParentClass10{
    synchronized void show(){
        System.out.println("Method of main class.");
    }
    static public void main(String arhgs[]){
        PV_19_MethodOverriding obj = new PV_19_MethodOverriding();
        obj.show();

    }
}
