final class B{
    final void meth1(){
        System.out.println("I am the method 1 of a class.");
    }
}


public class PV_02_FinalOverriding{
    // void meth1(){
    //     // super.meth1();
    //     System.out.println("I am the method 1 of main class.");
    // }
    static public void main(String args[]){

        B obj3 = new B();
        obj3.meth1();

    }
}

//This program will give you an error if you try to extends B class becasue we cannot extends any class which is already declare with final