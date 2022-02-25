public class PV_08_OverLoading {
    void show(Object a){
        System.out.println("I am the first show method of this class.");
    }

    void show(String a){
        System.out.println("I am the second show method of this class.");
    }

    public static void main(String args[]){
        PV_08_OverLoading obj = new PV_08_OverLoading();
        obj.show("ab");
    }
}
