public class PV_08_ForEachLoop {
    static public void main(String args[]){
        int arr[] = {1, 2, 4, 5, 7};
        int sum = 0;

        for(int element:arr){
            System.out.println("Element first is:"+element);
            sum +=  element;
            element = element * 100;
            System.out.println("Element after changing the element value:"+element); // No effect in the addition of this program
        }
        System.out.println("Sum is:"+sum);

    }
}
