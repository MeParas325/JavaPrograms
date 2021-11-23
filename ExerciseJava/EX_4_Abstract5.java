abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class CellPhone extends Telephone{
    public void ring(){
        System.out.println("Cellphone is ringing");
    }
    public void lift(){
        System.out.println("Picking the CellPhone");
    }
    public void disconnect(){
        System.out.println("Disconnecting the CellPhone");
    }
}

class SmartPhone extends CellPhone{
    public void ring(){
        super();
        System.out.println("SmartPhone is ringing");
    }
    public void lift(){
        System.out.println("Picking the smartPhone");
    }
}


public class EX_4_Abstract5 {
    public static void main(String[] args) {
        CellPhone cp;
        cp = new CellPhone();
        cp.ring();

        SmartPhone sp = new SmartPhone();
        sp.ring();
    }
}
