interface A{
    default void show(){
        System.out.println("Showing the default method.");
    }

    private void display(){
        System.out.println("Displaying the elements.");

    }
}



public class PV_01_PrivateMethodInterfaces implements A{
    public static void main(String arhs[]){
        PV_01_PrivateMethodInterfaces obj = new PV_01_PrivateMethodInterfaces();
        // obj.display(); //This line will give you an error because the display method declared private in A inrterface.
        obj.show();

    }
}