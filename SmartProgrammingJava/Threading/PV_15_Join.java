class MyThreadNew extends Thread{
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
    }
}

public class PV_15_Join extends Thread{
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("Child Thread:"+i);
        }
    }

    public static void main(String[] args) throws InterruptedException{
        PV_15_Join obj = new PV_15_Join();
        obj.start();
        obj.join();

        MyThreadNew obj2 = new MyThreadNew();
        obj2.start();
        obj2.join();

        for(int i = 1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
    }
}
