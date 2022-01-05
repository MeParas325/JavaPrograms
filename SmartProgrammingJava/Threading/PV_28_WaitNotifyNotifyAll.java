class TotalEarning extends Thread{
    int TotalEarning = 0;
    public void run(){
        for(int i = 1; i<=10; i++){
            TotalEarning = TotalEarning + 100;
        }
        notifyAll();
    }              
}
public class PV_28_WaitNotifyNotifyAll{
    public static void main(String args[])throws Exception{
        TotalEarning te = new TotalEarning();
        te.start();
        synchronized(te){
            te.wait();
            System.out.println(te.TotalEarning);
        }
    }
}