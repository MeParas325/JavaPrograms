public class PV_16_OverLoading {
    void show(float a, int b){
        System.out.println("Float int method.");
    }

    void show(int a, float b){
        System.out.println("Int float method.");
    }
    public static void main(String args[]){
        PV_16_OverLoading obj = new PV_16_OverLoading();
        obj.show(10, 25.5f);
        obj.show(26.7f, 34);
        // obj.show(24.5f, 78.9f); //this line will not give you ambiguity error this will give possibly conversion error
    }
}
