public class PV_05_VarArgsOverload {
    PV_05_VarArgsOverload(int ...v){
        this();
        System.out.println("Constructor called.");
        System.out.println(v.length);
    }

    PV_05_VarArgsOverload(){
        System.out.println("Non- argument constructor called.");
    }

    public static void main(String args[]){
        PV_05_VarArgsOverload obj = new PV_05_VarArgsOverload(1, 2, 3, 5, 7);
        PV_05_VarArgsOverload obj2 = new PV_05_VarArgsOverload();
    }
}
