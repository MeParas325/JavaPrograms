class Test{
    void show(){
        System.out.println("Test class method.");
    }
}
public class PV_01_MethodOverriding extends Test{
    void show(){
        System.out.println("Main class method.");
    }
    public static void main(String args[]){
        Test t = new Test();
        t.show();

        PV_01_MethodOverriding obj = new PV_01_MethodOverriding();
        obj.show();

    }
}