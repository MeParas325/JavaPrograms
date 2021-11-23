class MyThread3 extends Thread{
    public void run(){
        System.out.println("Running the method of MyThread3 class");
    }
}

class MyThread4 extends Thread{
    public void run(){
        System.out.println("Running the method of MyThread4 class");
    }
}

class MyThread5 extends Thread{
    public void run(){
        System.out.println("Running the method of MyThread5 class");
    }
}


class PV_04_MultiThread_MultiTask {
    public static void main(String[] args) {
        MyThread3 th1 = new MyThread3();
        th1.start();

        MyThread4 th2 = new MyThread4();
        th2.start();

        MyThread5 th3 = new MyThread5();
        th3.start();
    }
}
