class PV_02_VarArgsOverLoad{

    void VarArgsOverLoad(int ...v){
        System.out.println("Constructor called for integer.");
        for(int x: v){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    void VarArgsOverLoad(Boolean ...v){
        System.out.println("Constructor called for boolean values.");
        for(Boolean x: v){
            System.out.println(x+" ");
        }
        System.out.println();

    }
    public static void main(String args[]){
        PV_02_VarArgsOverLoad obj1 = new PV_02_VarArgsOverLoad();
        PV_02_VarArgsOverLoad obj2 = new PV_02_VarArgsOverLoad();

        obj1.VarArgsOverLoad(true, false, false, true, false);
        obj1.VarArgsOverLoad(1, 2, 3, 5, 76);
        // obj1.VarArgsOverLoad(); //This will show you an error because of varArgsAmbiguity


    }
}