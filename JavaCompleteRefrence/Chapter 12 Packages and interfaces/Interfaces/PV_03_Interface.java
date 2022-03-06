interface callback1{
    void show();
}
public class PV_03_Interface implements callback1{
    public void show(){
        System.out.println("I am the show method overide by the callback1 interface.");
    }
    public static void main(String args[]){
        PV_03_Interface obj = new PV_03_Interface();
        obj.show();
    }
}
