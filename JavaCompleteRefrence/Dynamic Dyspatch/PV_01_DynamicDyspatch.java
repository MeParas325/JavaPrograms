class Example{
    int i = 10;

    void show(){
        System.out.println("I am the method of Example class.");
    }
}
public class PV_01_DynamicDyspatch extends Example{
    int i = 20;
    
    void show(){
        // super.show();
        System.out.println("I am the method of second class!");
    }

    void show2(){
        System.out.println("I am the second method of second class!");
    }

    public static void main(String aegs[]){
        Example obj = new PV_01_DynamicDyspatch();
        System.out.println(obj.i);
        obj.show();
        // obj.show2(); //This will give you an error
    }
}