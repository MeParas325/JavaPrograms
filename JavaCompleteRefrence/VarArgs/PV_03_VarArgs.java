public class PV_03_VarArgs{

    void varArgs(String msg, int ...a){
        System.out.print(msg+":");
        for(int x: a){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int a[] = {10};
        int b[] = {1, 2, 5};
        int c[] = {};
        PV_03_VarArgs obj = new PV_03_VarArgs();
        obj.varArgs("One varArgs",a);
        obj.varArgs("Second varArgs",b);
        obj.varArgs("No Args",c);
    }
}