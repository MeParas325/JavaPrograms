public class PV_02_MultipleCatch {
    public static void main(String arghs[]){
        try {
            int c = 23/0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch(Exception e){
            System.out.println(e);
        }
    }
    // This program will give you an error that exception ArithmeticException has already been caught if you want this error will not come
    // you have to specify ArithmeticException instead of Exception 
}
