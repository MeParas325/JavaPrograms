import java.util.Scanner;
public class PV_15_MaxMin{
    static public void main(String args[]){
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<5; i++){
            System.out.println("Enter "+i+" number into the array:");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<5; i++){
            System.out.print(arr[i]+" ");
        }
        int temp = arr[0];
        for(int i = 0; i<5; i++){
            if(temp<=arr[i]){
                temp = arr[i];
            }
        }
        System.out.println("\nLargest element is:"+temp);

        

    }
}