public class PV_04_this {
    PV_04_this(){
        meth2(this);
        System.out.println("I will print after the method2.");

    }
    void meth2(PV_04_this obj){
        System.out.println("I am in method 2");
        System.out.println(obj);

    }
    public static void main(String args[]){
        PV_04_this obj = new PV_04_this();
        System.out.println(obj);
    }
}
