public class PV_06_OverLoading {
    void show(int a){
        System.out.println("I am the first show method of this class.");
    }

    // void show(char a){
    //     System.out.println("I am the third show method of this class.");
    // }
    public static void main(String args[]){
        PV_06_OverLoading obj = new PV_06_OverLoading();
        obj.show('a');
    }
}
