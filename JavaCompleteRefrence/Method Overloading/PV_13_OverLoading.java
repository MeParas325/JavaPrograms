public class PV_13_OverLoading {
    void show(Object a){
        System.out.println("Object method");
    }

    // void show(String str){
    //     System.out.println("String method");
    // }

    // void show(StringBuffer str){
    //     System.out.println("StringBuffer method");
    // }
    public static void main(String args[]){
        PV_13_OverLoading obj = new PV_13_OverLoading();
        obj.show(new StringBuffer("Paras"));
        obj.show("Tannu");
        obj.show(null);

    }
}
