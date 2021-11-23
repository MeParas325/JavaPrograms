class Thread4 extends Thread{
    public void run(){
        System.out.println("Running the run method of Thread2");
        if(Thread.currentThread().isDaemon()){
            System.out.println("This is the demon Thread");
        }
        else{
            System.out.println("Not a demon thread");
        }
    }
}

public class PV_08_DemonMEthods {
    public static void main(String[] args) {
        System.out.println("Doing something!");
        Thread4 t3 = new Thread4();
        t3.setDaemon(true);
        // t3.setDaemon(false);
        t3.start();
    }
}
