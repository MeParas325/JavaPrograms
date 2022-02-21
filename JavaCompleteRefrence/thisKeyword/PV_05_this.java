class Test{
    Test(PV_05_this obj){
        System.out.println("Test class constructor called!");
        System.out.println(obj);
    }
}
public class PV_05_this{
    void meth1(){
        Test obj = new Test(this);
        System.out.println("Inside the meth1 method!");
        System.out.println(obj);
    }
    public static void main(String args[]){
        PV_05_this obj = new PV_05_this();
        obj.meth1();
        System.out.println("Inside the main method!");
        System.out.println(obj);
    }
}