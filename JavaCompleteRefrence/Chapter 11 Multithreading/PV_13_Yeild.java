public class PV_13_Yeild extends Thread{
    public void run(){
        for(int i = 0; i<5; i++){
            Thread.yield();
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
    public static void main(String args[])throws InterruptedException{
        PV_13_Yeild obj = new PV_13_Yeild();
        obj.start();


        for(int i = 0; i<5; i++){
            Thread.sleep(1000);
            System.out.println("Main thread:"+i);
        }

    }
}
