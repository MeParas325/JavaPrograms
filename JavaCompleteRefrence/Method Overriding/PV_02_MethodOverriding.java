class Test1{
    void show(){
        System.out.println("Test1 method.");
    }
}
public class PV_02_MethodOverriding extends Test1{
    void show(){
        System.out.println("Main method.");
    }
    public static void main(String argsp[]){
        Test1 t = new PV_02_MethodOverriding();
        t.show();

    }
    
}
