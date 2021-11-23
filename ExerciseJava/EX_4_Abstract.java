abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{

    void write(){
        System.out.println("Writing with Fountain Pen");
    }

    void refill(){
        System.out.println("Refilling your pen");
    }

    void changeNip(){
        System.out.println("Changing the Nip of your Fountain pen");
    }
}


public class EX_4_Abstract {
    public static void main(String[] args) {
        
    }
}
