import java.util.Scanner;

public class PV_01_MaximumSumOfSubArray{
    static public void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i<n; i++){
            System.out.println("Enter the values of "+i+" index");
            arr[i] = sc.nextInt();
        }


        int maxSum = 0;
        int sum = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                sum = sum + arr[j];
                if(sum > maxSum) maxSum = sum;
            }
        }

        System.out.println(maxSum);
    }
}


// Time Complexity for this algorithm - O(N2), if we use hardcode array, So thats why we use "Kadane's algorithm"