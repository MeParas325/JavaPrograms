public class PV_10_Sleep extends Thread{
    public void run(){
        for(int i = 0; i<5; i++){
            try{
                Thread.sleep(1000);
                System.out.println(i);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        
    }
    static public void main(String args[]){
        PV_10_Sleep obj = new PV_10_Sleep();
        obj.start();
    }
}
