import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

class Thread3 extends Thread{
    public void run(){
        System.out.println("Running the run method of Thread2");
    }
}


public class PV_06_DemonMethods {
    public static void main(String[] args) {
        Thread3 t3 = new Thread3();
        t3.start();
        try{
            t3.setDaemon(true);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
