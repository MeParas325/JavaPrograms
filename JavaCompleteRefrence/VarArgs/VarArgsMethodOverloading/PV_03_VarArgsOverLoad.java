public class PV_03_VarArgsOverLoad {
    void meth1(int ...v){

    }

    void meth1(int a, int ...v){

    }
    static public void main(String args[]){
        PV_03_VarArgsOverLoad obj = new PV_03_VarArgsOverLoad();
        obj.meth1(1, 2, 3, 5, 7, 8);
        obj.meth1(1, 2, 4, 6);\

        //This programs will not run it will also show you the varArgsAmbiguity

    }
}
