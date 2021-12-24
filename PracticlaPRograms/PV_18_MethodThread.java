class MyThrrr extends Thread{
    public MyThrrr(String name){
        super(name);
        System.out.println("Name is transferred to super class constructor");
    }

    public void run(){
        System.out.println("I am the run method of MyThrr");
    }
}

public class PV_18_MethodThread {
    public static void main(String[] args) {
        MyThrrr obj = new MyThrrr("Paras");
        MyThrrr obj2 = new MyThrrr("Tannu");
        obj.start();
        System.out.println("Name is:"+obj.getId());
        System.out.println("Name is:"+obj.getName());

        System.out.println("Name is:"+obj2.getId());
        System.out.println("Name is:"+obj2.getName());
    }
}
