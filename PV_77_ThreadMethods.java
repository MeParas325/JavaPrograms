class MyThrrr3 extends Thread{
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("Run Away");
            i++;
        }
    }
}

class MyThrrr4 extends Thread{
    public void run(){
        int i = 0;
        while(i<100){
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("I Love You");
            i++;
        }
    }
}


public class PV_77_ThreadMethods {
    public static void main(String[] args) {
        MyThrrr3 th1 = new MyThrrr3();
        MyThrrr4 th2 = new MyThrrr4();
        th1.start();
        try{
            th1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        th2.start();
        
    }
}
