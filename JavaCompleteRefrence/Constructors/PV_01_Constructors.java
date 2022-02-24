class Test1{
    Test1(){
        System.out.println("I am the constructor of test1 class.");
    }

}

class Test2 extends Test1{
    Test2(){
        System.out.println("I am the constructor of test2 class.");
    }

}

class Test3 extends Test2{
    Test3(){
        System.out.println("I am the constructor of test3 class.");
    }

}


public class PV_01_Constructors extends Test3{
    PV_01_Constructors(){
        System.out.println("I amt the constructor of main class.");
    }
    public static void main(String args[]){
        PV_01_Constructors obj = new PV_01_Constructors();

    }
}