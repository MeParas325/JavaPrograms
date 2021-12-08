class BookSeat{
    int total_seats = 10;
    void seat(int seats){
        System.out.println("Hi:"+Thread.currentThread().getName());
        System.out.println("Hi:"+Thread.currentThread().getName());
        System.out.println("Hi:"+Thread.currentThread().getName());
        System.out.println("Hi:"+Thread.currentThread().getName());
        System.out.println("Hi:"+Thread.currentThread().getName());
        System.out.println("Hi:"+Thread.currentThread().getName());
        System.out.println("Hi:"+Thread.currentThread().getName());
        synchronized(this){
            if(total_seats>=seats){
                System.out.println("Seats Booked Successsfully");
                total_seats = total_seats - seats;
                System.out.println("Seats left:"+total_seats);
            }
            else{
                System.out.println("Seats cannot be booked");
                System.out.println("Seats left:"+total_seats);
            }
        }
        System.out.println("Hi:"+Thread.currentThread().getName());
        System.out.println("Hi:"+Thread.currentThread().getName());
        System.out.println("Hi:"+Thread.currentThread().getName());
        System.out.println("Hi:"+Thread.currentThread().getName());
        System.out.println("Hi:"+Thread.currentThread().getName());
        System.out.println("Hi:"+Thread.currentThread().getName());
        System.out.println("Hi:"+Thread.currentThread().getName());
    }
}

public class PV_27_SynchronizationBlock extends Thread{
    static BookSeat b;
    int seats;
    public void run(){
        b.seat(seats);
    }
    static public void main(String args[]){
         b = new BookSeat();
         PV_27_SynchronizationBlock Paras = new PV_27_SynchronizationBlock();
         Paras.seats = 11;
         Paras.start();

         PV_27_SynchronizationBlock Tannu = new PV_27_SynchronizationBlock();
         Tannu.seats = 10;
         Tannu.start();
    }
}