public class PV_02_DefaultMethodInterface implements A{
    public void meth1(){
        System.out.println("I am the method 1.");
    }

    public String meth2(){
        return "This is modified string.";
    }
    public static void main(String arghs[]){
        PV_02_DefaultMethodInterface obj = new PV_02_DefaultMethodInterface();
        obj.meth1();
        System.out.println(obj.meth2());

    }
}
