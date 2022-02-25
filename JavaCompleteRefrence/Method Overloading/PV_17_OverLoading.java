public class PV_17_OverLoading {
    // void show(Object a, Object b){
    //     System.out.println("Object Object method.");
    // }

    void show(Object a, float b){
        System.out.println("Object Float method.");
    }

    void show(float a, int b){
        System.out.println("Float int method.");
    }

    void show(int a, float b){
        System.out.println("Int float method.");
    }
    public static void main(String args[]){
        PV_17_OverLoading obj = new PV_17_OverLoading();
        obj.show(10, 25.5f);
        obj.show(26.7f, 34);
        obj.show(24.5f, 78.9f); 
    }
}
