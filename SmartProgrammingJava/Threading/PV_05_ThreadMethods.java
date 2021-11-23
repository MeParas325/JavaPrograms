class Thread1 extends Thread{
    public void run(){
        System.out.println("Running the method1 of thread1");
    }
}

class Thread2 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Satish");
        System.out.println("New name of Thread2 is:"+Thread.currentThread().getName());
        System.out.println("Checking thread is alive or not:"+Thread.currentThread().isAlive());
        System.out.println("Running the method of Thread2");
    }
}



public class PV_05_ThreadMethods {
    public static void main(String[] args) {
        System.out.println("Thread name is:"+Thread.currentThread().getName());
        Thread.currentThread().setName("Paras");
        System.out.println("New name of Thread is:"+Thread.currentThread().getName());
        System.out.println("\n");
        
        Thread1 t1 = new Thread1();
        String n = t1.getName();
        System.out.println("Name of t1 is:"+n);
        t1.setName("Tannu");
        System.out.println("New name of t1 is:"+t1.getName());
        boolean a = t1.isAlive();
        System.out.println(a);
        t1.start();
        System.out.println("Result is:"+t1.isAlive());
        System.out.println("\n");

        Thread2 t2 = new Thread2();
        System.out.println(t2.getName());
        System.out.println(t2.isAlive());
        t2.start();

        System.out.println(t2.isAlive());
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());


    }
}
