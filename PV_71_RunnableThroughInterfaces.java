class MyRunnable implements Runnable{
    public void run(){
        int i = 0;
        while(i<30){
            System.out.println("I am the thread of MyRunnable");
            i++;
        }
    }
}

class MyRunnable2 implements Runnable{
    public void run(){
        int i = 0;
        while(i<30){
            System.out.println("I am the thread of MyRunnable2");
            i++;
        }
    }
}



public class PV_71_RunnableThroughInterfaces {
    public static void main(String[] args) {
        MyRunnable bullet1 = new MyRunnable();
        Thread gun1 = new Thread(bullet1);

        MyRunnable2 bullet2 = new MyRunnable2();
        Thread gun2 = new Thread(bullet2);
        
        gun1.start();
        gun2.start();
    }
}
