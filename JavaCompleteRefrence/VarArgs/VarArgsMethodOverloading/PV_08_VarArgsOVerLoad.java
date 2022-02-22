public class PV_08_VarArgsOVerLoad {
    void meth(int ...v){
        System.out.println("Parameterized method.");

    }

    void meth(boolean ...v){
        System.out.println("Boolean parameterized constructor called.");
    }

    public static void main(String args[]){
        PV_08_VarArgsOVerLoad obj = new PV_08_VarArgsOVerLoad();
        PV_08_VarArgsOVerLoad obj2 = new PV_08_VarArgsOVerLoad();
        // obj.meth(); //An ambguity is present here
        obj2.meth(1, 2, 4, 7, 7);
    }
}
