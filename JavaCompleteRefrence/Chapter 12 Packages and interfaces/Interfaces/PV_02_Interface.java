public class PV_02_Interface implements callBack{
    void callBack(int a){
        System.out.println("Interface method called.");
        System.out.println("Value is:"+a);
    }
    static public void main(String args[]){
        PV_02_Interface obj = new PV_02_Interface();
        obj.callBack(5);

    }
}
