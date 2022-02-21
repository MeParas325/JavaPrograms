public class PV_02_this {
    PV_02_this(){
        this(10);
        System.out.println("Non-parameterized constructor called!");
    }

    PV_02_this(int i){
        System.out.println("Parameterized constructor called!");
        System.out.println(i);
    }
    public static void main(String args[]){
        PV_02_this obj = new PV_02_this();
    }
}
