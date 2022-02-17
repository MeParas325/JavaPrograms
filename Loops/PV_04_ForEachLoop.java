public class PV_04_ForEachLoop {
    static public void main(String args[]){
        int arr[] = {1, 2, 3, 5, 6, 7};
        int sum = 0;

        for(int x:arr)System.out.println(sum+=x);

        System.out.println("The last sum of the arrays elements is:"+sum);
    }
}
