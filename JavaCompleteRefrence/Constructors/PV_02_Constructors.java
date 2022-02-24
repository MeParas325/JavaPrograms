class Test4{
    Test4(int i, int j){
        System.out.println("I am the parametirezed constructor of test4 class.");
    }
    Test4(){
        System.out.println("I am the constructor of test1 class.");
    }

}

class Test5 extends Test4{
    Test5(){
        System.out.println("I am the constructor of test2 class.");
    }

}

class Test6 extends Test5{
    Test6(){
        System.out.println("I am the constructor of test3 class.");
    }

}


public class PV_02_Constructors extends Test6{
    PV_02_Constructors(){
        System.out.println("I amt the constructor of main class.");
    }
    public static void main(String args[]){
        PV_02_Constructors obj = new PV_02_Constructors();

    }
}