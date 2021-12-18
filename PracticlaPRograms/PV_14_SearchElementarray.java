import java.util.Scanner;
public class PV_14_SearchElementarray{
    static public void main(String args[]){
        int j = 0, temp;
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<5; i++){
            System.out.println("Enter "+i+" number into the array:");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<5; i++){
            System.out.print(arr[i]+" ");
        }
        
        System.out.println("\nEnter the number you want to search in the array:");
        temp = sc.nextInt();

        for(j = 0; j<5; j++){
            if(temp == arr[j]){
                System.out.println(arr[j]+" is found at index "+j);
                break;
            }
        }

        if(j == 5){
            System.out.println("Element is not found");
        }
    }
}