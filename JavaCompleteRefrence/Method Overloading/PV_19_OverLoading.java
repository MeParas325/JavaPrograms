public class PV_19_OverLoading{
    void show(int a){
        System.out.println("int method");
    }

    void show(float ...varargs){
        System.out.println("float VarArgs method.");
    }
    static public void main(String args[]){
        PV_19_OverLoading obj = new PV_19_OverLoading();
        obj.show(10);
        obj.show();
        obj.show(10, 20, 40);
    }
}