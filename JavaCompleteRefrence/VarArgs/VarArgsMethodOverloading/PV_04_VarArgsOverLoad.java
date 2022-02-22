public class PV_04_VarArgsOverLoad {
    PV_04_VarArgsOverLoad(int ...v){
        System.out.println("Constructor called.");
        System.out.println(v.length);
    }

    public static void main(String args[]){
        PV_04_VarArgsOverLoad obj = new PV_04_VarArgsOverLoad(1, 2, 3, 5, 7);
        PV_04_VarArgsOverLoad obj2 = new PV_04_VarArgsOverLoad();
    }
}
