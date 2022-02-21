class Test1{
    int outer_x = 10;
    void meth(){
        for(int i = 0; i<10; i++){
            class InnerForLoop{
                void display(){
                    // System.out.println("Value of i is:"+i);
                    System.out.println("Outer Variable value is:"+(outer_x++));

                }
            }
            InnerForLoop obj = new InnerForLoop();
            obj.display();
        }
    }
}
public class PV_04_InnerClass {
    public static void main(String args[]){
        Test1 obj = new Test1();
        obj.meth();
    }
}
