public class PV_06_Thread_Priority extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("I am the running method of this class.");
    }
    static public void main(String args[]){

        System.out.println("Main thread priority is:"+Thread.currentThread().getPriority());
        PV_06_Thread_Priority obj = new PV_06_Thread_Priority();
        obj.start();

        Thread.currentThread().setPriority(4);
        System.out.println("New Priority of main thread is:"+Thread.currentThread().getPriority());

        


    }
}
