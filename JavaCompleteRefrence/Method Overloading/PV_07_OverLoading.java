public class PV_07_OverLoading {
    void show(Object a){
        System.out.println("I am the first show method of this class.");
    }

    void show(String a){
        System.out.println("I am the second show method of this class.");
    }

    // void show(char a){
    //     System.out.println("I am the third show method of this class.");
    // }
    public static void main(String args[]){
        PV_07_OverLoading obj = new PV_07_OverLoading();
        obj.show('a');
    }
}
