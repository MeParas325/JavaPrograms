class MyThread1 extends Thread{
    public void run(){
        System.out.println("Running the MyThread1 Method");
    }
}

public class PV_03_MultiThread_MultiTask extends Thread{
    public void run(){
        System.out.println("Running the method of 2nd class");
    }
    public static void main(String[] args) {
        MyThread1 th1 = new MyThread1();
        th1.start();

        PV_03_MultiThread_MultiTask th2 = new PV_03_MultiThread_MultiTask();
        th2.start();
    }
}
