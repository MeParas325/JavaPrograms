class PV_01_VarArgsOverLoad{

    PV_01_VarArgsOverLoad(int ...v){
        System.out.println("Constructor called for integer.");
        for(int x: v){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    PV_01_VarArgsOverLoad(Boolean ...v){
        System.out.println("Constructor called for boolean values.");
        for(Boolean x: v){
            System.out.println(x+" ");
        }
        System.out.println();

    }
    public static void main(String args[]){
        PV_01_VarArgsOverLoad obj1 = new PV_01_VarArgsOverLoad(2, 3, 56, 7);
        PV_01_VarArgsOverLoad obj2 = new PV_01_VarArgsOverLoad(true, false, false, true);

    }
}