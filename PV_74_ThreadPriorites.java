class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        while(true){
            System.out.println("Thank You: "+this.getName());
        }
    }
}




public class PV_74_ThreadPriorites {
    public static void main(String[] args) {
        MyThr th1 = new MyThr("Paras1(Most  1)");
        MyThr th2 = new MyThr("Paras2(Most Most 2)");
        MyThr th3 = new MyThr("Paras3(Most Most Most 3)");
        MyThr th4 = new MyThr("Paras4(Most Most Most Most 4)");
        MyThr th5 = new MyThr("Paras5(Most Most Most Most Most 5)");

        th1.setPriority(Thread.MAX_PRIORITY);
        th2.setPriority(Thread.MIN_PRIORITY);
        th3.setPriority(Thread.MIN_PRIORITY);
        th4.setPriority(Thread.MIN_PRIORITY);
        th5.setPriority(Thread.NORM_PRIORITY);
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
    }
}
