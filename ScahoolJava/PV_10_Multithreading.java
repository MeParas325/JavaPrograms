import java.util.Scanner;
class MyClass extends Thread{
    public void run(){
        table();
        System.out.println("Running the run method");
    }
    
    public void table(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want the table of:");
        int a = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.format("%d X %d = %d\n", a, i, a*i);
        }
    }

}
class MyClass1 extends Thread{
    public void run(){
        table();
        System.out.println("Running the run method");
    }
    
    public void table(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want the table of:");
        int a = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.format("%d X %d = %d\n", a, i, a*i);
        }
    }

}


public class PV_10_Multithreading {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        Thread t1 = new Thread(obj);
        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        MyClass1 obj1 = new MyClass1();
        Thread t2 = new Thread(obj1);
        t2.start();
    }
}
