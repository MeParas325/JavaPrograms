public class PV_18_OverLoading{
    void show(int a){
        System.out.println("int method");
    }

    void show(int ...varargs){
        System.out.println("VarArgs method.");
    }
    static public void main(String args[]){
        PV_18_OverLoading obj = new PV_18_OverLoading();
        obj.show(10);
        obj.show();
        obj.show(10, 20, 40);

    }
}