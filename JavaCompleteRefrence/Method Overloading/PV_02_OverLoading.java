class C{
    void show(){
        System.out.println("I am the method of C class.");
    }
}

class D extends C{
    void show(){
        System.out.println("I am the method of D class.");
    }
}

public class PV_02_OverLoading extends D{
    public static void main(String args[]){
        D obj = new D();
        obj.show();

        PV_02_OverLoading obj2 = new PV_02_OverLoading();
        obj2.show();
    }
}
