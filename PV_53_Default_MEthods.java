interface Camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good morning gyus");
    }
    default void slowMotion(){
        greet();
        System.out.println("Recoridng in slow motion");
    }
}

interface MyWifi{
    String [] setNetworks();
    void connectingNetworks(String network);
}

class MyCellPhone{
    void makeCall(int phonenumber){
        System.out.println("Calling to:"+phonenumber);
    }

    void pickCall(){
        System.out.println("Connecting...");
    }

    // void slowMotion(){
    //     System.out.println("Recording in slowMotion 920fps..");
    // }

    // void sendMessage(int number){
    //     System.out.println("Sending message to:"+number);
    // }
}

class MySmartPhone extends MyCellPhone implements MyWifi, Camera{
     public void takeSnap(){
         System.out.println("Taking photos from the smartPhone");
     }

     public void recordVideo(){
         System.out.println("Recording video..");
     }

     public void connectingNetworks(String ntwork){
         System.out.println("Connecting to the networks.");
     }

    //  public void slowMotion(){
    //      System.out.println("Making lsow motion in 9000 fps.");
    //  }

     public String[] setNetworks(){
         System.out.println("These are the list of the networks...");
         String[] networks = {"Paras", "Tanuja", "Realme 6"};
         return networks;

     }

}

public class PV_53_Default_MEthods {
    public static void main(String[] args) {

        MySmartPhone ms = new MySmartPhone();
        String[] arr = ms.setNetworks();
        for(String i:arr){
            System.out.println(i);
        }
        
        MyCellPhone cp = new MyCellPhone();
        // cp.slowMotion();
        ms.slowMotion();

        // ms.greet();//Error because is a private metthod and we cannot access it directly
        
    }
    
}
