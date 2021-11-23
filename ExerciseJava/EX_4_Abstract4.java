interface TVRemote{
    void changeChannel();
}

interface SmartTVRemote extends TVRemote{
    void openNetflix();
}

class TV implements TVRemote{
    public void openNetflix(){
        System.out.println("Playing money heist");
    }

    void changeChannel(){
        System.out.println("Now we are changing netflix to amazon prime");
    }

    void MyNewMeth(){
        System.out.println("This is my new Method");
    }
}

public class EX_4_Abstract4 {
    public static void main(String[] args) {
        TV obj = new TV();
        obj.openNetflix();

    }
}
