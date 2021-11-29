public class PV_19_Join extends Thread{
    static Thread mainThread;
    public void run(){
        for(int i = 1; i<=5; i++){
            try{
                mainThread.join();
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
    }

    static public void main(String[] args) {
        mainThread = Thread.currentThread();
        PV_19_Join obj = new PV_19_Join();
        obj.start();

        for(int i = 1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+"-"+i);
        };
    }
}
