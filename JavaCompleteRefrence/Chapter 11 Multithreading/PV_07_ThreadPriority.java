public class PV_07_ThreadPriority extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("I am the running method of this class.");
        Thread.currentThread().setPriority(1);
        System.out.println("New priority of this class thread is:"+Thread.currentThread().getPriority());
    }
    static public void main(String args[]){

        System.out.println("Main thread priority is:"+Thread.currentThread().getPriority());
        PV_07_ThreadPriority obj = new PV_07_ThreadPriority();
        obj.start();

        Thread.currentThread().setPriority(4);
        System.out.println("New Priority of main thread is:"+Thread.currentThread().getPriority());

        


    }
}
