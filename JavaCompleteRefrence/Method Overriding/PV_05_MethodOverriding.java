class Test5{
    Object show(){
        System.out.println("Object return.");
        return null;
    }

}
public class PV_05_MethodOverriding extends Test5{
    String show(){
        System.out.println("Return string.");
        return "Tanuja";
    }
    static public void main(String args[]){
        Test5 t = new PV_05_MethodOverriding();
        t.show();
        // String name = t.show(); //This line will give you an error you can try it
        // System.out.println(name);



    }
}
