interface MyInterface{
    void show1();
    //  static void show2(); //You cannot do this it will show you an error if you want to try then just try it.
}

public class PV_02_Interface implements MyInterface{
    public void show1(){
        System.out.println("The first show method.");
    }

    static public void main(String args[]){
        PV_02_Interface obj = new PV_02_Interface();
        obj.show1();

    }
}
