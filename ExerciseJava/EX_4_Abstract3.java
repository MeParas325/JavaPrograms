interface TVRemote{
    void changeChannel();
}

interface SmartTVRemote extends TVRemote{
    void openNetflix();
}

class TV implements SmartTVRemote{
    public void openNetflix(){
        System.out.println("Playing money heist");
    }

    public void changeChannel(){
        System.out.println("Now we are changing netflix to amazon prime");
    }
}

public class EX_4_Abstract3 {
    public static void main(String[] args) {
        TV obj = new TV();
        obj.openNetflix();
        obj.changeChannel();

    }
}
