public class PV_07_Static_var {
    static int count = 0;
    PV_07_Static_var(){
        count++;
        System.out.println("No of objects:"+count);
        
    }
    public static void main(String[] args) {
        PV_07_Static_var obj = new PV_07_Static_var();
        PV_07_Static_var obj2 = new PV_07_Static_var();

        System.out.println("No of object:"+count);
    }
}
