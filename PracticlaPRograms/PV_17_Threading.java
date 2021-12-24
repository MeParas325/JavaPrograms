class MyThread extends Thread{
    public void run(){
        while(true){
            System.out.println("Method of MyThread is running.");
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        while(true){
            System.out.println("Method of MyThread2 is running.");
        }
    }
}


public class PV_17_Threading {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }
}
