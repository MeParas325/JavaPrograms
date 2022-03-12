import java.util.Random;

public class PV_03_Try_Catch {
    public static void main(String args[]){
        Random r = new Random();
        int a = 0, b = 0, c = 0;

        for(int i = 0; i<10; i++){
            try{
                a = r.nextInt();
                System.out.println(a);
                b = r.nextInt();
                System.out.println(b);
                c = 1234/(a/b);
            }catch(ArithmeticException e){
                System.out.println(e);
                c = 0;
            }
        }

        System.out.println("After for and try catch block.");
    }
    
}
