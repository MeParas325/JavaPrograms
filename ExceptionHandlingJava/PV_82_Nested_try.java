import java.util.Scanner;
 class PV_82_Nested_try {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []marks = new int[3];

        marks[0] = 34;
        marks[1] = 0;
        marks[2] = 88;
        boolean flag = true;
        while(flag){
            System.out.println("Enter the index of which number you want to divide");
            int index = sc.nextInt();
    
            System.out.println("Enter the number form which you want to divide the index number");
            int number = sc.nextInt();
    
            try {
                System.out.println("Inside of the try block:");
                try{
                    System.out.println("The index you entered, number is:"+marks[index]);
                    flag = false;
                }
                catch(ArithmeticException e){
                    System.out.println(e);
                }
                
            } catch (Exception e) {
                System.out.println("At the level 2");
            }
        }



    }
}
