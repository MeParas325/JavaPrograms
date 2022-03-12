public class PV_01_MultipleCatch {
    public static void main(String args[]){
        try {
            int a = args.length;
            System.out.println("a: "+a);
            int b = 42/a;
            int c[] = {1};
            c[23] = 54;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception:"+e);
        }
        catch(Exception e){
            System.out.println("Exception:"+e);
        }

        System.out.println("After try/catch blocks.");
    }
    
}
