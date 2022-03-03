class Test7{
    Object show(){
        System.out.println("Returning object.");
        return null;
    }
}
public class PV_06_MethodOverriding extends Test7{
    String show(){
        System.out.println("Returning string.");
        return "Tanuja";
    }
    static public void main(String args[]){
        Test7 t = new Test7();
        Object t2 = t.show();
        System.out.println(t2);

    }
}
