class Test10{
    Test10(int i, int j){
        System.out.println("I am the parametirezed constructor of test10 class.");
        System.out.println("Value of i and j is:"+i+" "+j);
    }
}

class Test11 extends Test10{
    Test11(){
        super(10, 20);
        System.out.println("I am the constructor of test2 class.");
    }

}

class Test12 extends Test11{
    Test12(int i, int j){
        super();
        System.out.println("I am the constructor of test3 class.");
        System.out.println("Value of i and j is:"+i+" "+j);
    }

}


public class PV_04_Constructors extends Test12{
    PV_04_Constructors(){
        super(30, 40);
        System.out.println("I amt the constructor of main class.");
    }
    public static void main(String args[]){
        PV_04_Constructors obj = new PV_04_Constructors();

    }
}