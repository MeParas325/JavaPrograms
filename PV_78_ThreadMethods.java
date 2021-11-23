class MyThrrr5 extends Thread{
    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Run Away");
        }
    }
}

class MyThrrr6 extends Thread{
    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("I Love You");
        }
    }
}


public class PV_78_ThreadMethods {
    public static void main(String[] args) {
        MyThrrr5 th1 = new MyThrrr5();
        MyThrrr6 th2 = new MyThrrr6();
        th1.start();
        th2.start();
        
    }
}

