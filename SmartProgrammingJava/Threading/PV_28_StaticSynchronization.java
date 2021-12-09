class BooKMovieSeat{
    int totalSeats = 10;

    public void seats(int seats){
        if(totalSeats >= seats){
            System.out.println(seats+" Seats Booked Successfully.");
            totalSeats = totalSeats - seats;
            System.out.println(totalSeats+" Seats Left.");
        }
        else{
            System.out.println("Seats connot be booked");
            System.out.println(totalSeats+" Seats Left.");
        }
    }
}

class MyThread1 extends Thread{
    BooKMovieSeat b;
    int seats;
    MyThread1(BooKMovieSeat b, int seats){
        this.b = b;
        this.seats = seats;
    }

    public void run(){
        b.seats(seats);
    }
}

class MyThread2 extends Thread{
    BooKMovieSeat b;
    int seats;
    MyThread2(BooKMovieSeat b, int seats){
        this.b = b;
        this.seats = seats;
    }

    public void run(){
        b.seats(seats);
    }
}

public class PV_28_StaticSynchronization{
    public static void main(String args[]){
        BooKMovieSeat b1 = new BooKMovieSeat();
        MyThread1 t1 = new MyThread1(b1, 8);
        t1.start();
        MyThread2 t2 = new MyThread2(b1, 30);
        t2.start();

        // BooKMovieSeat b2 = new BooKMovieSeat();
        // MyThread1 t3 = new MyThread1(b2, 8);
        // t3.start();
        // MyThread2 t4 = new MyThread2(b2, 2);
        // t4.start();


    }
}