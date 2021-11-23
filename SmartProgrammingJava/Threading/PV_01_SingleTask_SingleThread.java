class MyThread extends Thread{
    public void run(){
        System.out.println("Running the run method");
    }
}

class PV_01_SingleTask_SingleThread{
    public static void main(String[] args) {
        MyThread th = new MyThread();
        th.start();
    }
}