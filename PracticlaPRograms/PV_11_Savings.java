import java.util.Scanner;
class Account{
    int accno;
    double balance;
    String yourName;

    public void getData(int accno, double balance, String yourName){
        this.accno = accno;
        this.balance = balance;
        this.yourName = yourName;
        display();
    }

    public void display(){
        System.out.println("Account Number :"+accno);
        System.out.println("Name :"+yourName);
        System.out.println("Balance :"+balance);
    }
}
public class PV_11_Savings{
    static public void main(String args[]){
           int accno;
           double balance;
           String yourName;
    
           Scanner sc = new Scanner(System.in);
    
           System.out.println("Enter your accno:");
           accno = sc.nextInt();
    
           System.out.println("Enter the balance in your account:");
           balance = sc.nextInt();
           sc.nextLine();
    
           System.out.println("Enter you Name:");
           yourName = sc.nextLine();

           Account ac = new Account();
           ac.getData(accno, balance, yourName);
           
    }
}

