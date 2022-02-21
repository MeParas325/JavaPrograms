public class PV_03_this {
    PV_03_this(){
        System.out.println("Non-parameterized constructor called!");
    }

    PV_03_this(int i){
        this();
        System.out.println("Parameterized constructor called!");
        System.out.println(i);
    }
    public static void main(String args[]){
        PV_03_this obj = new PV_03_this(10);
    }
}

