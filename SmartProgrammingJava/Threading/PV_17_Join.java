class Medical extends Thread{
    public void run(){
        System.out.println("Medical is taking....");
        try{
            Thread.sleep(3000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Medical is successfully taken!Nothing is worry You are eligicble to drive your car.");
    }
}

class TestDriver extends Thread{
    public void run(){
        try{
            System.out.println("Test drive is start now");
            Thread.sleep(5000);
            System.out.println("Test drive is successfull now..");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

class OfficerSign extends Thread{
    public void run(){
        try{
            System.out.println("Checking all of your documents");
            Thread.sleep(10000);
            System.out.println("Your documents are correct. You are eligible to drive a four wheeler.");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

public class PV_17_Join {
    public static void main(String[] args)throws InterruptedException {
         Medical md = new Medical();
         md.start();
         md.join();

         TestDriver td = new TestDriver();
         td.start();
         td.join();

         OfficerSign os = new OfficerSign();
         os.start();
         td.join();
    }
}
