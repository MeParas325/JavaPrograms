abstract class Parent1{
    public Parent1(){
        System.out.println("I am the constructor of Parent1 class");
    }

    void KiaseHo(){
        System.out.println("Me to theek hu");
    }

    abstract void greet();
    abstract void greet2();

}    

class Child extends Parent1{
    @Override
    public void greet(){
        System.out.println("I am the method of child class");
    }
    @Override
    public void greet2(){
        System.out.println("I am the method 2 of child class");
    }
}


abstract class Child2 extends Parent1{
    public void func2(){
        System.out.println("I am the method of Child2 class");
    }

    public void greet2(){
        System.out.println("Hello, How are you");
    }
}

class PV_51_Abstract {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.greet();
        obj.KiaseHo();
    }

}