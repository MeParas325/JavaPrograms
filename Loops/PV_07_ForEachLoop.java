public class PV_07_ForEachLoop {
    static public void main(String args[]){
        int arr[] = {1, 2, 4, 5, 7};
        int sum = 0;

        for(int element:arr){
            sum +=  element;
            element = element * 100;
        }
        System.out.println("Sum is:"+sum);

        sum = 0;
        for(int element:arr){
            sum += element;
        }
        System.out.println("Again sum is:"+sum);
    }
}
