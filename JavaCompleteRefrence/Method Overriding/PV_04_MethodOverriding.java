class Test4{
    Object show(){
        System.out.println("Returning object.");
        return null;
    }
}
public class PV_04_MethodOverriding extends Test4{
    String show(){
        System.out.println("Returning string.");
        return "Paras";
    }
    public static void main(String args[]){
        Test4 t = new Test4();
        t.show();

        PV_04_MethodOverriding obj = new PV_04_MethodOverriding();
        String name = obj.show();
        System.out.println(name);

    }
}
