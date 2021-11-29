class NewThread extends Thread{
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
}

public class PV_18_Join extends NewThread{
    static public void main(String[] args) {
        NewThread.mainThread = Thread.currentThread();
        NewThread obj = new NewThread();
        obj.start();

        for(int i = 1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+"-"+i);
        };
    }
}
