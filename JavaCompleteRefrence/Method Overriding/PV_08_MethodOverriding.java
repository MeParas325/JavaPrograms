class Test9{
    Object show(){
        System.out.println("Returning object.");
        return null;
    }
}
public class PV_08_MethodOverriding extends Test9{
    Float show(){
        System.out.println("Returning string.");
        return 34.5f;
    }
    static public void main(String args[]){
        Test9 t = new Test9();
        Object t2 = t.show();
        System.out.println(t2);

        PV_08_MethodOverriding obj = new PV_08_MethodOverriding();
        float a = obj.show();
        System.out.println(a);

    }
}
