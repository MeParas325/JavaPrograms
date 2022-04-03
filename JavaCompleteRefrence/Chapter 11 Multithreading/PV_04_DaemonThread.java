public class PV_04_DaemonThread extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Demon thread.");
        }else{
            System.out.println("Not a daemon thread.");
        }
    }
    public static void main(String args[]){
        
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println("Main method");

        PV_04_DaemonThread obj = new PV_04_DaemonThread();
        obj.start();

    }
}
