public class PV_03_DefaultMethodInterface implements A{
    public void meth1(){
        System.out.println("I am the method 1.");
    }

    public String meth2(){
        return "This is modified string.";
    }
    public static void main(String arghs[]){
        A obj = new PV_03_DefaultMethodInterface();
        obj.meth1();
        System.out.println(obj.meth2());

    }
}
