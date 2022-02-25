public class PV_10_OverLoading {
    void show(Object a){
        System.out.println("I am the first show method of this class.");
    }

    // void show(String a){
    //     System.out.println("I am the second show method of this class.");
    // }

    public static void main(String args[]){
        PV_10_OverLoading obj = new PV_10_OverLoading();
        // obj.show('a');
        // obj.show(1);
        obj.show(22.4f);
    }
}
