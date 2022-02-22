public class PV_01_VarArgs{

    void varArgs(int a[]){
        System.out.print("No of args "+a.length+" contents:");
        for(int x: a){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int a[] = {10};
        int b[] = {1, 2, 5};
        int c[] = {};
        PV_01_VarArgs obj = new PV_01_VarArgs();
        obj.varArgs(a);
        obj.varArgs(b);
        obj.varArgs(c);

    }
}