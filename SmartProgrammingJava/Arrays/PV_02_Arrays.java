import java.util.Scanner;
 class PV_02_Arrays {
    public static void main(String[] args) {
        // int []arr = {34, 45, 34, 56, 45};
        Scanner sc = new Scanner(System.in);
        int []arr = new int[5];

        for(int i = 0; i<arr.length;i++)
        {
            System.out.println("Enter "+i+" element of the array");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        
    }
}
