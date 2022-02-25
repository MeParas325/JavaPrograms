public class PV_12_OverLoading {
    void show(Object a){
        System.out.println("Object method");
    }

    // void show(StringBuffer str){
    //     System.out.println("StringBuffer method.");
    // }

    void show(String s){
        System.out.println("String method");
    }

    public static void main(String args[]){
        PV_12_OverLoading obj = new PV_12_OverLoading();
        obj.show("String");
        obj.show(new StringBuffer("Paras"));
    }
}
