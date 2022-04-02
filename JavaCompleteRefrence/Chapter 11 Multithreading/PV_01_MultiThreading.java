public class PV_01_MultiThreading extends Thread{
    public void run(){
        System.out.println("Thread name:"+Thread.currentThread().getName());
        Thread.currentThread().setName("Paras");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String args[]){

        System.out.println(Thread.currentThread().getName());

        Thread.currentThread().setName("Tanuja");        
        System.out.println(Thread.currentThread().getName());

        System.out.println(Thread.currentThread().isAlive());

        PV_01_MultiThreading t = new PV_01_MultiThreading();
        t.start();

        PV_01_MultiThreading t2 = new PV_01_MultiThreading();
        t2.start();
        t2.setName("Riya");
        System.out.println(t2.getName());

        System.out.println(t.isAlive());
        System.out.println(t2.isAlive());
        System.out.println(Thread.currentThread().isAlive());

        // t2.setName("Riya"); //These both line will do nothing because thread t2 is terminated
        // System.out.println(t2.getName());

    }
}