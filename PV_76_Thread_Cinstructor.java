class MyThrrr extends Thread{
    public MyThrrr(String name){
        super(name);
        System.out.println("Name is transferred to super class constructor");
    }

    public void run(){
        System.out.println("I am the run method");
    }
}

class MyThrrr1 extends Thread{
    public void run(){
        System.out.println("I am the run method");
    }
}


public class PV_76_Thread_Cinstructor {
    public static void main(String[] args) {
        MyThrrr obj = new MyThrrr("Paras");
        MyThrrr obj2 = new MyThrrr("Tannu");
        MyThrrr1 obj3 = new MyThrrr1();
        obj.start();
        System.out.println("Name is:"+obj.getId());
        System.out.println("Name is:"+obj.getName());

        System.out.println("Name is:"+obj2.getId());
        System.out.println("Name is:"+obj2.getName());

        obj3.setName("Arpit");
        System.out.println("Name is:"+obj3.getName());
        System.out.println("Name is:"+obj3.getId());
    }
}
