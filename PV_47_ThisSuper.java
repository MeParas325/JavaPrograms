class MyClass{
    int a;

    MyClass(int a){
        this.a = a;
        System.out.println("Constructor called and the value is:"+a);
    }
}

class MyNewClass extends MyClass{
    MyNewClass(int c){
        super(c);
        System.out.println("Constructor called of MyNewClass");;
    }
}
class PV_47_ThisSuper {
    public static void main(String[] args) {
        MyClass obj = new MyClass(6);
        System.out.println("The value is:"+obj.a);
        MyNewClass obj1 = new MyNewClass(99);
    }
}
