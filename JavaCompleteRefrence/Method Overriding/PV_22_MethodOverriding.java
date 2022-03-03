class ParentClass13{
    void show(){
        System.out.println("I am the show method of parentclass 10.");
    }
}

public class PV_22_MethodOverriding extends ParentClass13{
    synchronized void show(){
        System.out.println("Method of main class.");
    }
    static public void main(String arhgs[]){
        PV_22_MethodOverriding obj = new PV_22_MethodOverriding();
        obj.show();

        //this program will give you an error

    }
}
