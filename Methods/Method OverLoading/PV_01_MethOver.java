public class PV_01_MethOver{
    void test(){
        System.out.println("This method is for testing.");
    }

    void test(double i){
        System.out.println("Value of double is:"+i);
    } 
    public static void main(String args[]){
        int i = 66;
        PV_01_MethOver obj = new PV_01_MethOver();
        obj.test();
        obj.test(34.5);
        obj.test(i);
    }
}