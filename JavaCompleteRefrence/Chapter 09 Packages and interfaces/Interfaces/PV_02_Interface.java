public class PV_02_Interface implements callBack{
    public void callback(int a){
        System.out.println("I am the overriden method of callback interface.");
        System.out.println("Value of parameter is:"+a);
    }
    public static void main(String args[]){
        PV_02_Interface obj = new PV_02_Interface();
        obj.callback(10);

    }
}