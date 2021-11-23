public class PV_02_SingleTask_MultiThread extends Thread{
    public void run(){
        System.out.println("Running the run method");
    }
    public static void main(String[] args) {
        PV_02_SingleTask_MultiThread th1 =  new PV_02_SingleTask_MultiThread();
        th1.start();

        PV_02_SingleTask_MultiThread th2 =  new PV_02_SingleTask_MultiThread();
        th2.start();
    }
}

