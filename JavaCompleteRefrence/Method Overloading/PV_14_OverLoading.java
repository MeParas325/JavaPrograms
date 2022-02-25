public class PV_14_OverLoading {
    void show(String str){
        System.out.println("String method");
    }

    void show(StringBuffer str){
        System.out.println("StringBuffer method");
    }
    public static void main(String args[]){
        PV_14_OverLoading obj = new PV_14_OverLoading();
        obj.show(new StringBuffer("Paras"));
        obj.show("Tannu");
        // obj.show(null); //Ambiguity arrives here this will giver you an error

    }
}
