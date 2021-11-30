// package SmartProgrammingJava.Threading;
class NewThread1 extends Thread{
    public void run(){
        for(int i = 0; i<=5; i++){
            try{
                Thread.sleep(1000);
                System.out.println(i);
            }
            catch(Exception e){
                System.out.println(Thread.currentThread().getName()+"-"+e);
            }
        }
    }
}

public class PV_20_Interupt {
    public static void main(String[] args) {
        NewThread1 obj = new NewThread1();
        obj.start();
        obj.interrupt();
    }
}
