class BookSeat extends Thread{
    int totalSeats = 10;
    int seats;
    public void seats(int seats){
        this.seats = seats;
    }
    public void run(){
        if(totalSeats>=seats){
            System.out.println(Thread.currentThread().getName()+" Seats booked successfully");
            totalSeats = totalSeats -seats;
            System.out.println(Thread.currentThread().getName()+" Seats left:"+totalSeats);
        }
        else{
            System.out.println(Thread.currentThread().getName()+" Seats cannot be booked");
        }
    }
}

public class PV_23_WithoutSynchronization extends BookSeat{
    static public  void main(String[] args) {
        BookSeat Paras = new BookSeat();
        Paras.seats(9);
        Paras.start();

        MovieSeat Tannu = new MovieSeat();
        Tannu.seats = 5;
        Tannu.start();
    };
}
