class BookSeat{
    int total_seats = 10;
    synchronized void seat(int seats){
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
}

public class PV_26_SynchronizationMethod extends Thread{
    static BookSeat b;
    int seats;
    public void run(){
        b.seat(seats);
    }
    static public void main(String args[]){
         b = new BookSeat();
         PV_26_SynchronizationMethod Paras = new PV_26_SynchronizationMethod();
         Paras.seats = 10;
         Paras.start();

         PV_26_SynchronizationMethod Tannu = new PV_26_SynchronizationMethod();
         Tannu.seats = 11;
         Tannu.start();
    }
}