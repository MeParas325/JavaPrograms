public class PV_10_Sleep extends Thread{
    public void run(){
        try{
            for(int i = 1; i<=5; i++){
                Thread.sleep(1000);
                System.out.println("Value of i in the run method is:"+i);
            }
        }
        catch(Exception e){
            System.out.println("Exception occurs");
            System.out.println(e);
        }
        System.out.println("Running the run method");
    }
    public static void main(String[] args)throws Exception {
        for(int i = 1; i<=5; i++){
            Thread.sleep(1000);
            System.out.println("Value of i is:"+i);
        }

        PV_10_Sleep obj = new PV_10_Sleep();
        obj.start();
    }
}
