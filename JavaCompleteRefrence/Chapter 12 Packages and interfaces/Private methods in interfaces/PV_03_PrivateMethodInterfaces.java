interface C{
    default void show(){
        display();
        System.out.println("Showing the default method.");
    }

    private void display(){
        System.out.println("Displaying the elements.");

    }
}



public class PV_03_PrivateMethodInterfaces implements C{
    public static void main(String arhs[]){
        C obj = new PV_03_PrivateMethodInterfaces();
        obj.show();

    }
}