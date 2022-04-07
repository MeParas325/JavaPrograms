public class PV_12_Sleep extends Thread{
    public void run(){
        for(int i = 0; i<5; i++){
            try{
                Thread.sleep(1000);
                System.out.println(i+":"+Thread.currentThread().getName());
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
    static public void main(String args[]){
        PV_12_Sleep obj1 = new PV_12_Sleep();
        obj1.run();
        PV_12_Sleep obj2 = new PV_12_Sleep();
        obj2.run();
    }
}
