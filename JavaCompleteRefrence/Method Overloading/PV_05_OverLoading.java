public class PV_05_OverLoading {
    void show(int a){
        System.out.println("I am the first show method of this class.");
    }

    void show(String a){
        System.out.println("I am the second show method of this class.");
    }

    public static void main(String args[]){
        PV_05_OverLoading obj = new PV_05_OverLoading();
        obj.show('q');
    }
}
