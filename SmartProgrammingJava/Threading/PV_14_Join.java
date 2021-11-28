public class PV_14_Join extends Thread{
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("Child Thread:"+i);
        }
    }

    public static void main(String[] args) throws InterruptedException{
        PV_14_Join obj = new PV_14_Join();
        obj.start();
        obj.join();

        for(int i = 1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
    }
}
