class Test3{
    void show(String name){
        System.out.println("Test3 method.");
    }
}
public class PV_03_MethodOverriding extends Test3{
    void show(String name){
        System.out.println("Main method.");
    }
    public static void main(String argsp[]){
        Test3 t = new PV_03_MethodOverriding();
        t.show("Tanuja");

    }
    
}
