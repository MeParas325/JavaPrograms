class Test8{
    String show(){
        System.out.println("Returning String.");
        return null;
    }
}
public class PV_07_MethodOverriding extends Test8{
    String show(){
        System.out.println("Returning string.");
        return "Tanuja";
    }
    static public void main(String args[]){
        Test8 t = new Test8();
        Object t2 = t.show();
        System.out.println(t2);

    }
}
