public class PV_12_Yeild extends Thread{
    public void run(){
        for(int i = 0; i<5; i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
    public static void main(String args[]){
        PV_12_Yeild obj = new PV_12_Yeild();
        obj.start();

        Thread.yield();

        System.out.println("Main thread.");

    }
}
