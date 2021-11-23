public class PV_11_Sleep2 extends Thread{
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
        th.start();

        PV_11_Sleep2 th2 = new PV_11_Sleep2();
        th2.start();
    }
}
