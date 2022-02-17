public class PV_02_VarForLoop {
    static public void main(String args[]){
        for(var i = 2; i<=100; i<<=1)System.out.print(i+" ");

        System.out.println();

        int arr[] = {1, 2, 4, 5, 6};
        for(var x : arr)System.out.print(x+" ");

        System.out.println();
    }
}
