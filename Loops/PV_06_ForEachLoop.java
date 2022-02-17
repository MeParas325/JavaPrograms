public class PV_06_ForEachLoop {
    static public void main(String args[]){
        int arr1[] = {1, 2, 3, 4, 5};
        int sum = 0;
        for(int x: arr1){
            System.out.println("Value of x before incrementing:"+x);
            System.out.println(sum+=x);
            if(x == 3)break;
            System.out.println("Value of x after incrementing:"+x);
        }

        System.out.println(sum);
    }
}

