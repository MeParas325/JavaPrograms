public class PV_03_DemonThread extends Thread{
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

        PV_03_DemonThread obj = new PV_03_DemonThread();
        obj.setDaemon(true);
        obj.start();

    }
}
