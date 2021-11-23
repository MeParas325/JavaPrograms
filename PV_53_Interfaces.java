interface BiCycle{
    int a = 24;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface Bike{
    void bikeBrake();
    void bikeSpeed();
}


class TitanCycle implements BiCycle{
    public void applyBrake(int a){
        System.out.println("Applying Brake in Cycle");
    }

    public void speedUp(int increment){
        System.out.println("Speeding up your cycle");
    }

    void blowHorn(){
        System.out.println("Blowing horn Poo Poooo..");
    }
}

class MyCycle implements BiCycle, Bike{
    int a = 45;
    public void applyBrake(int a){
        System.out.println("Applying Brake in Cycle");
    }

    public void speedUp(int increment){
        System.out.println("Speeding up your cycle");
    }

    public void bikeBrake(){
        System.out.println("Bike ke brake kag gye");
    }

    public void bikeSpeed(){
        System.out.println("Bike tez bhaag rhi hai");
    }
}

class PV_53_Interfaces {
    public static void main(String[] args) {
        //Making the object of TitanCycle class
        TitanCycle cycle1 = new TitanCycle();
        cycle1.applyBrake(3);
        cycle1.speedUp(5);
        //You can create properties in interfaces
        System.out.println(cycle1.a);

        //You cannit modifies the property in interfaces as they are final
        // cycle1.a = 34;
        // System.out.println(cycle1.a);


        //Making the object of MyCycle class
        MyCycle cycle2 = new MyCycle();
        cycle2.applyBrake(6);
        cycle2.speedUp(6);
        cycle2.bikeBrake();
        cycle2.bikeSpeed();
        System.out.println(cycle2.a);



    }
}
