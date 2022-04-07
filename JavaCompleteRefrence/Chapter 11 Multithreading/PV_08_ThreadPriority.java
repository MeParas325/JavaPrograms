public class PV_08_ThreadPriority extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("I am the running method of this class.");
    }
    static public void main(String args[]){

        System.out.println("Main thread priority is:"+Thread.currentThread().getPriority());
        PV_08_ThreadPriority obj = new PV_08_ThreadPriority();
        obj.start();
        obj.setPriority(10);

    }
}
