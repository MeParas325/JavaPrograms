interface B{
    default void show(){
        display();
        System.out.println("Showing the default method.");
    }

    private void display(){
        System.out.println("Displaying the elements.");

    }
}



public class PV_02_PrivateMethodInrterfaces implements B{
    public static void main(String arhs[]){
        PV_02_PrivateMethodInrterfaces obj = new PV_02_PrivateMethodInrterfaces();
        obj.show();

    }
}