class Test7{
    Test7(int i, int j){
        System.out.println("I am the parametirezed constructor of test7 class.");
        System.out.println("Value of i and j is:"+i+" "+j);
    }
}

class Test8 extends Test7{
    Test8(){
        super(10, 20);
        System.out.println("I am the constructor of test2 class.");
    }

}

class Test9 extends Test8{
    Test9(){
        System.out.println("I am the constructor of test3 class.");
    }

}


public class PV_03_Constructors extends Test9{
    PV_03_Constructors(){
        System.out.println("I amt the constructor of main class.");
    }
    public static void main(String args[]){
        PV_03_Constructors obj = new PV_03_Constructors();

    }
}