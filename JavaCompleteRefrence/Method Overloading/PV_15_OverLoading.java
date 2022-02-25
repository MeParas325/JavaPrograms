public class PV_15_OverLoading {
    void show(float a, int b){
        System.out.println("Float int method.");
    }

    void show(int a, float b){
        System.out.println("Int float method.");
    }
    public static void main(String args[]){
        PV_15_OverLoading obj = new PV_15_OverLoading();
        obj.show(10, 25.5f);
        obj.show(26.7f, 34);
        // obj.show(10, 20); //this will show you ambiguity error 
    }
}
