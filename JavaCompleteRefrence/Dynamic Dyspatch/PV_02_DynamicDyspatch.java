class Example3{
    int i = 10;

    void show(){
        System.out.println("I am the method of Example class.");
    }

    void meth1(){
        System.out.println("I am the method1 of this class");
    }
}

class Example4 extends Example3{
    int i = 20;

    void show(){
        System.out.println("I am the method of Example4 class!");
    }
}

public class PV_02_DynamicDyspatch extends Example3{
    int i = 20;
    void show(){
        System.out.println("I am the method of second class!");
    }

    void show2(){
        System.out.println("I am the second method of second class!");
    }

    void show3(){
        System.out.println("I am the thrid method of third class!");
    }

    public static void main(String aegs[]){
        Example3 obj = new PV_02_DynamicDyspatch();
        obj.show();
        obj.meth1();
        // // obj.show2(); //This will give you an error
        // obj.show3();  //This will also give you an error
    }
}