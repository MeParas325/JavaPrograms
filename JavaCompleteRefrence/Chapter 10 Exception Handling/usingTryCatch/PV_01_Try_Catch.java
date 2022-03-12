public class PV_01_Try_Catch{
    public static void main(String args[]){
        int a = 23, d;

        try {
            d = 0;
            int c = a/d;
            System.out.println("This will not printed.");
        } catch (Exception e) {
            System.out.println("Exception: "+e);
        }
    }
}