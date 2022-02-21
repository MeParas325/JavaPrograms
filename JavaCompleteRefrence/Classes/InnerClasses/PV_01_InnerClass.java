public class PV_01_InnerClass{
    private int outer_x = 100;

    private void test(){
        InnerClass obj = new InnerClass();
        obj.display();
    }

    class InnerClass{
        void display(){
            System.out.println("The value of outer_x is:"+outer_x);
        }

    }
    public static void main(String args[]){
        PV_01_InnerClass obj = new PV_01_InnerClass();
        obj.test();

    }
}