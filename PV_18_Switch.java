import java.util.Scanner;

public class PV_18_Switch {
    public static void main(String[] args) {
        System.out.println("Enter tha age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        switch (age) {
            case 18:
                System.out.println("You are going to become an adult");
                break;
            
            case 23:
                System.out.println("You are going to get a job");
                break;

            case 60:
                System.out.println("You are going to be retired");
                break;
        
            default:
                System.out.println("Enjoy your life buddy");
                break;
        }
    }
}
