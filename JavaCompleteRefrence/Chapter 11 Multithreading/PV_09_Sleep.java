public class PV_09_Sleep {
    public static void main(String args[])throws InterruptedException{
        for(int i = 0; i<5; i++){
            Thread.sleep(2000);
            System.out.println(i);
        }
    }
}
