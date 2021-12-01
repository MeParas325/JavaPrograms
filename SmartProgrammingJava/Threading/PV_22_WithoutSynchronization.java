class BookSeat{
    int totalSeats = 10;

    public void seats(int seats){
         if(totalSeats >= seats){
             System.out.println(Thread.currentThread().getName()+" Seats booked successfully.");
             totalSeats = totalSeats - seats;
             System.out.println(Thread.currentThread().getName()+" Seats left:"+totalSeats);
         }
         else{
             System.out.println(Thread.currentThread().getName()+" Seats cannot be booked right now!");
             System.out.println(Thread.currentThread().getName()+"Seats left:"+totalSeats);
         }
    }
}

class MovieSeat extends Thread{
    BookSeat b = new BookSeat();
    int seats;
    public void run(){
        b.seats(seats);
    }
}


public class PV_22_WithoutSynchronization extends MovieSeat{
    public static void main(String[] args) {
        MovieSeat Paras = new MovieSeat();
        Paras.seats = 9;
        Paras.start();

        MovieSeat Tannu = new MovieSeat();
        Tannu.seats = 5;
        Tannu.start();
    }
}
