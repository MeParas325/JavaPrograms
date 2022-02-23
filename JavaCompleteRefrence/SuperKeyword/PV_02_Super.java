class Super2{
    void m1(){
        System.out.println("I am the method of Super1 class.");
    }
}
public class PV_02_Super extends Super2{
    void show(){
        super.m1();
        System.out.println("Showing the show method of PV_02_Super class.");
    }
    public static void main(String args[]){
        PV_02_Super obj =  new PV_02_Super();
        obj.show();
    }
}
