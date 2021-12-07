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

class MovieApp extends Thread{
    static BookSeat b;
    int seats;
    public void run(){
        b.seat(seats);
    }
}

public class PV_24_SynchronizationMethod extends MovieApp{
    static public void main(String args[]){
         b = new BookSeat();
         MovieApp Paras = new MovieApp();
         Paras.seats = 7;
         Paras.start();

         MovieApp Tannu = new MovieApp();
         Tannu.seats = 8;
         Tannu.start();
    }
}