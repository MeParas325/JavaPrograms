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

public class PV_25_SynchronizationMethod extends Thread{
    static BookSeat b;
    int seats;
    public void run(){
        b.seat(seats);
    }
    static public void main(String args[]){
         b = new BookSeat();
         PV_25_SynchronizationMethod Paras = new PV_25_SynchronizationMethod();
         Paras.seats = 7;
         Paras.start();

         PV_25_SynchronizationMethod Tannu = new PV_25_SynchronizationMethod();
         Tannu.seats = 1;
         Tannu.start();
    }
}