public class PV_07_VartArgsOverLoad {
    void meth(int ...v){
        System.out.println("Parameterized method.");

    }

    public static void main(String args[]){
        PV_07_VartArgsOverLoad obj = new PV_07_VartArgsOverLoad();
        PV_07_VartArgsOverLoad obj2 = new PV_07_VartArgsOverLoad();
        obj.meth();
        obj2.meth(1, 2, 4, 7, 7);
    }
}
