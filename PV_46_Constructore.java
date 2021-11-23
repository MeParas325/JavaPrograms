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
    }

    Derived(int b){
        System.out.println("I am the constructor of derived class and my value is: "+b);
    }
}

class PV_46_Constructore{
    public static void main(String[] args) {
        // MyConstruct obj = new MyConstruct();
        MyConstruct obj1 = new MyConstruct(3);
        Derived obj2 = new Derived(44);
    }
}