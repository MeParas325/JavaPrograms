class MyThreadClass extends Thread{
    public void run(){
        System.out.println("The priority of this thread is:"+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("The new priority of this thread is:"+Thread.currentThread().getPriority());

        System.out.println("Running the run method");
    }
}


public class PV_09_ThreadPrioties {
    public static void main(String[] args) {
        System.out.println("Main thread Priority is:"+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(712
);
        System.out.println("The new Priority of main thread is:"+Thread.currentThread().getPriority());

        MyThreadClass th1 = new MyThreadClass();
        th1.start();
    }
}
