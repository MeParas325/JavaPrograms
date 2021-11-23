class A{
    public int a;

    public int Paras(){
        return 4;
    }

    public void method1(){
        System.out.println("I am the method 1 of class A");
    }
}

class B extends A{
    @Override
    public void method1(){
        System.out.println("I am the method 1 of class B");
    }

    public void method2(){
        System.out.println("I am the method 2 of class B");
    }
}

class PV_44_Method_Overriding{
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.method1();

        B obj2 = new B();
        obj2.method1();
    }
}