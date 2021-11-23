public class PV_12_Sleep3 extends Thread {
    public void run(){   
        try{
            for(int i = 0; i<5; i++){
                Thread.sleep(1000);
                System.out.println(i+" "+Thread.currentThread().getName());
            }
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
public static void main(String[] args) {
    PV_11_Sleep2 th = new PV_11_Sleep2();
    th.run();

    PV_11_Sleep2 th2 = new PV_11_Sleep2();
    th2.run();
  }
}
