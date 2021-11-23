class Phone{
    public void kaiseHo(){
        System.out.println("Or bahi kesa hai");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void showTime(){
        System.out.println("Time is 8am...");
    }
    public void on(){
        System.out.println("Turning on Smartphone...");
    }
}

public class PV_50_Dynamic_dyspatch_Method {
    public static void main(String[] args) {
        // Phone obj = new Phone();

        Phone obj = new SmartPhone();
        // SmartPhone obj = new Phone(); //Not Allowed
        obj.kaiseHo();
        obj.on();
        // obj.theekhu();
    }
}
