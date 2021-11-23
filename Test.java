import java.util.Scanner;
class Input{
    public static void main(String[] args){
        System.out.print("enter name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Name' : " + name);
        sc.close();
    }
}
class Test23 extends Input{
    public static void main(String[] args) {
        //int m1, m2, m3, m4, m5;
        System.out.println("Enter marks in five subjects: ");
        Scanner sc = new Scanner (System.in);
        int marks[] = new int[5];
        for (int i =0; i < 5; i++){
            marks[i] = sc.nextInt();
        }
        for (int i =0; i < 5; i++){
            System.out.println(marks[i]);
        }
        sc.close();
        // System.out.println(q);
    }
}