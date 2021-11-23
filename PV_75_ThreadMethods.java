class MyThd1 extends Thread{
    public void run(){
        int i = 0;
        while(i<5){
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Thank You");
            i++;
        }
    }
}

class MyThd2 extends Thread{
    public void run(){
        int i = 0;
        while(i<10){
            System.out.println("Thank You for running me in second time");
            i++;
        }
    }
}

public class PV_75_ThreadMethods {
    public static void main(String[] args) {
        MyThd1 obj = new MyThd1();
        MyThd2 obj2 = new MyThd2();
        obj.start();
        try{
            obj.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        obj2.start();
    }
}
