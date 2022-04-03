public class PV_02_DemonThread extends Thread{
    public void run(){
        System.out.println("Demon thread.");
    }
    public static void main(String args[]){
        
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println("Main method");

        PV_02_DemonThread obj = new PV_02_DemonThread();
        obj.start();

    }
}
