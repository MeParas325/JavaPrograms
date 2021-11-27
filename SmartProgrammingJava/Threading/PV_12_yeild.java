class MyThread11 extends Thread{
    public void run(){
        for(int i = 0; i<=5; i++){
            Thread.yield();
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
    }
}

public class PV_12_yeild{
    public static void main(String[] args) {
        
        for(int i = 0; i<=5; i++){
            System.out.println("Main method is:"+i);
        }

        MyThread11 obj = new MyThread11();
        obj.start();

    }
}
