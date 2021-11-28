public class PV_13_Join extends Thread{
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("Child Thread:"+i);
        }
    }

    public static void main(String[] args){
        PV_13_Join obj = new PV_13_Join();
        obj.start();

        for(int i = 1; i<=5; i++){
            try{
                obj.join();
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
    }
}
