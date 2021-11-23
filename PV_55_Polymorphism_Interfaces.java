interface Camera2{
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

interface MyWifi2{
    String [] setNetworks();
    void connectingNetworks(String network);
}

class MyCellPhone2{
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

class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, Camera2{
     public void takeSnap(){
         System.out.println("Taking photos from the smartPhone");
     }

     public void recordVideo(){
         System.out.println("Recording video..");
     }

     public void connectingNetworks(String ntwork){
         System.out.println("Connecting to the networks.");
     }

     public void slowMotion1(){
         System.out.println("Making lsow motion in 9000 fps.");
     }

     public String[] setNetworks(){
         System.out.println("These are the list of the networks...");
         String[] networks = {"Paras", "Tanuja", "Realme 6"};
         return networks;

     }

}

class PV_55_Polymorphism_Interfaces {
    public static void main(String[] args) {
        Camera2 cam1 = new MySmartPhone2(); //Can only use Camera2 methods
        // cam1.setNetworks(); -->Not allowed
        // cam1.slowMotion1(); -->Not allowed 
        cam1.slowMotion(); 

        MySmartPhone2 s = new MySmartPhone2();
        s.takeSnap();
        s.recordVideo();
        s.connectingNetworks("Paras");
        s.slowMotion1();
        s.pickCall();
        s.makeCall(7849);
    }
}
