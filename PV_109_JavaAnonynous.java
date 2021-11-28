interface myInterface{
    public void meth1();
    public void meth2();
}

// class MyPhone implements myInterface{
//     public void run(){
//         System.out.println("Running the run method of class MyPhone");
//     }

//     public void meth1(){
//         System.out.println("Running the meth1 of MyPhone Class");
//     }

//     public void meth2(){
//         System.out.println("Running the meth2 of MyPhone Class");
//     }
// }

public class PV_109_JavaAnonynous {
    public static void main(String[] args) {
        // myInterface obj2 = new MyPhone();
        // obj2.meth1();
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
