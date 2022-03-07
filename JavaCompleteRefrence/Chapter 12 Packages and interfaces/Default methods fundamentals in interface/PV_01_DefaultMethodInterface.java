public class PV_01_DefaultMethodInterface implements A{
    public void meth1(){
        System.out.println("I am the method 1.");
    }
    public static void main(String args[]){
        A obj = new PV_01_DefaultMethodInterface();
        obj.meth1();
        System.out.println(obj.meth2());

    }
}