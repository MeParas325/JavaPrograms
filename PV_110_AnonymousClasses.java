@FunctionalInterface
interface myInterface{
    public void meth1();
}

public class PV_110_AnonymousClasses {
    public static void main(String[] args) {
        //Anonymous Class
        myInterface obj = new myInterface() {
             @Override
             public void meth1(){
                 System.out.println("Running the first run method of main method");
             }
             @Override
             public void meth2(){
                 System.out.println("Running the second run method of main method");
             }
        };

        obj.meth1();

    }
}
