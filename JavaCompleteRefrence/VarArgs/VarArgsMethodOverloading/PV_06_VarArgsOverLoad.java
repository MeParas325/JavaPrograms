public class PV_06_VarArgsOverLoad {
    void meth(){
        System.out.println("Non-parameterized method.");

    }
    void meth(int ...v){
        System.out.println("Parameterized method.");

    }

    public static void main(String args[]){
        PV_06_VarArgsOverLoad obj = new PV_06_VarArgsOverLoad();
        PV_06_VarArgsOverLoad obj2 = new PV_06_VarArgsOverLoad();
        obj.meth();
        obj2.meth(1, 2, 4, 6, 7);
    }
}
