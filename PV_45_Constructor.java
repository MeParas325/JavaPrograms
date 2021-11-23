class MyConstruct{
    MyConstruct(){
        System.out.println("I am the constructor of MyConstruct class:");
    }

    MyConstruct(int a){
        System.out.println("I am the constructor of MyConstruct class and my value is: "+ a);
    }
}

class Derived extends MyConstruct{
    Derived(){
        System.out.println("I am the constructor of derived class:");
        // super(7);
    }

    Derived(int a, int b){
        super(a);
        System.out.println("I am the constructor of derived class and my value is: "+a+" "+b);
    }
}

class ChildOfDerived extends Derived{
    ChildOfDerived(){
        System.out.println("ChildOfDerived constructor called.");
    }

    ChildOfDerived(int a, int b, int c){
        super(a, b);
        System.out.println("ChildOfDerived constructor called and the arguments are: " +a+" "+b+" "+c);
    }
}

class PV_45_Constructor{
    public static void main(String[] args) {
        // MyConstruct obj = new MyConstruct();
        // MyConstruct obj1 = new MyConstruct();
        // Derived obj2 = new Derived();
        // Derived obj2 = new Derived(12, 56);
        ChildOfDerived cd = new ChildOfDerived(34, 56, 78);
    }
}