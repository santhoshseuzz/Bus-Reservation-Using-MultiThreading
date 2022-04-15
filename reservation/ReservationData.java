package reservation;

public class ReservationData extends Thread{
    ReservationMethods counter;
    String passenger;
    int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public ReservationMethods getCounter() {
        return counter;
    }

    public void setCounter(ReservationMethods counter) {
        this.counter = counter;
    }

    public String getPassenger() {
        return passenger;
    }

    public void setPassenger(String passenger) {
        this.passenger = passenger;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    int seats;
    volatile int availableSeats = 10;

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

//    public ReservationData(String passenger, int seats, ReservationMethods counter) {
//        this.passenger = passenger;
//        this.seats = seats;
//        this.counter= counter;
//    }

   public  void run(){
       counter.bookticket(passenger,seats);
    }

    }

