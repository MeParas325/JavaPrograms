class Super3{
    Super3(){
        System.out.println("I am the constructor of super3 class.");
    }
}
public class PV_03_Super extends Super3{
    PV_03_Super(){
        System.out.println("I am the constructor of PV_03_Super class.");
    }
    static public void main(String args[]){
        PV_03_Super obj = new PV_03_Super();
    }
}
