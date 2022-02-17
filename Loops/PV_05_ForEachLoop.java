public class PV_05_ForEachLoop {
    static public void main(String args[]){
        int arr1[] = {1, 2, 3, 4, 5};
        int sum = 0;
        for(int x: arr1){
            if(x == 3)break;
            System.out.println(sum+=x);
        }

        System.out.println(sum);
    }
}
