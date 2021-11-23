class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        System.out.println("Thank You");
        // while(true){
        //     System.out.println("I am the Thread of MyThr");
        // }
    }
}


public class PV_73_ThreadConstructor{
    public static void main(String[] args) {
         MyThr obj = new MyThr("Paras");    
         MyThr obj2 = new MyThr("Tannu");
         obj.start();
         obj2.start();
         System.out.println("The id of the thread is:"+obj.getId());
         System.out.println("The is of name the thread is:"+obj.getName());
         System.out.println("The id of the thread2 is:"+obj2.getId());
         System.out.println("The is of name the thread2 is:"+obj2.getName());

    }
}