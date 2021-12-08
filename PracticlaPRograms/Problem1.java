import java.util.Scanner;
public class Problem1{
    int accno;
    int balance;
    String yourName;
    String accountType;
    int withDraw;
    int deposit;

    Scanner sc = new Scanner(System.in);

    public void getData(){
        System.out.println("Enter your accno:");
        accno = sc.nextInt();
        System.out.println("Enter the balance in your account:");
        balance = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter you Name:");
        yourName = sc.nextLine();
        System.out.println("What's your account type:");
        accountType = sc.nextLine();
    }

    public void display(){
        System.out.println("Account no is:"+accno);
        System.out.println("Account Balance is:"+balance);
        System.out.println("Name is:"+yourName);
        System.out.println("Account type is:"+accountType);
        System.out.println("Withdrawn Money:"+withDraw);
        System.out.println("Deposit Money:"+deposit);
    }

    public void withDraw(){
        System.out.println("How much money you want to withdraw:");
        withDraw = sc.nextInt();
    }

    public void deposit(){
        System.out.println("Enter the money you want to deposit:");
        deposit = sc.nextInt();
    }

    public static void main(String args[]){
        Problem1 obj = new Problem1();
        obj.getData();
        obj.deposit();
        obj.withDraw();
        obj.display();
    }
}