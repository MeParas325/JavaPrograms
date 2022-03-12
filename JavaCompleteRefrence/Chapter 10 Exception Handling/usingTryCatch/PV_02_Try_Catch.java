public class PV_02_Try_Catch{
    public static void main(String args[]){
        int a = 23, d;

        try {
            d = 6;
            int c = a/d;
            System.out.println("This will printed.");
        } catch (Exception e) {
            System.out.println("Exception: "+e);
        }
    }
}