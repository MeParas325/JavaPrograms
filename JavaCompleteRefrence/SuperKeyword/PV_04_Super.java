class Super4{
    Super4(){
        System.out.println("I am the constructor of super4 class.");
    }
}
public class PV_04_Super extends Super4{
    PV_04_Super(){
        super();
        System.out.println("I am the constructor of PV_04_Super class.");
    }
    static public void main(String args[]){
        PV_04_Super obj = new PV_04_Super();
    }
}
