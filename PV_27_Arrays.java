public class PV_27_Arrays {
    public static void main(String[] args) {
        int marks[] = {1, 56, 24, 23, 78};
        String students[] = {"Paras", "Karan", "Tanuja", "Kailash", "Palak", "Riya"};

        System.out.println(marks.length);
        System.out.println(students.length);

        //Displaying all elements of array by using for loop
        // System.out.println("Printing all elements of Array by using for loop");
        // for(int i = 0; i<students.length; i++){
        //     System.out.println(students[i]);
        // }
        // System.out.println("Printing all elements of Array by using for loop");
        // for(int i = students.length-1; i>=0; i--){
        //     System.out.println(students[i]);
        // }
        System.out.println("Printing all elements of Array by using for each loop");
        for(String element: students){
            System.out.println(element);
        }
    }
}
 