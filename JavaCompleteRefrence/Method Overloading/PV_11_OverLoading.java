public class PV_11_OverLoading {
    void show(StringBuffer str){
        System.out.println("StringBuffer method.");
    }

    void show(String s){
        System.out.println("String method");
    }

    public static void main(String args[]){
        PV_11_OverLoading obj = new PV_11_OverLoading();
        obj.show("String");
        obj.show(new StringBuffer("Paras"));
    }
}
