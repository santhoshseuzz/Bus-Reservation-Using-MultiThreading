package reservation;

import java.util.ArrayList;
import java.util.Scanner;

public class ReservationMethods {

    ArrayList<ReservationData> list =  new ArrayList<>();
    Scanner get =  new Scanner(System.in);
    ReservationData a= null;


    void add(){
        ReservationData  temp = new ReservationData();
        ReservationMethods obj = new ReservationMethods();
        System.out.print("\n\nEnter passenger name :");
        String name= get.next();
        temp.setPassenger(name);
        System.out.print("Enter the seats you want to book :");
        int seats = get.nextInt();
        temp.setSeats(seats);
        System.out.print("Enter 1 for Vip customer :");
        int status = get.nextInt();
        temp.setStatus(status);
        temp.setCounter(obj);
        list.add(temp);
    }

    void  threadrun() throws InterruptedException {
        for(ReservationData i :list){
            i.start();
            if(i.getStatus()==1){
             i.setPriority(1);
            }

        }
    }
     static int availableSeats = 100;

    public synchronized void bookticket(String passenger,int seats){
        if((availableSeats>=seats)&&(seats>0)){
            availableSeats=availableSeats-seats;
            System.out.println("NAME:"+passenger+" seats booked "+seats);
        }
        else if(availableSeats<seats && availableSeats!=0){
            seats = seats-availableSeats;
            int avi=availableSeats;
            availableSeats-=availableSeats;
            System.out.println("NAME :"+passenger+" BOOKED = "+avi+" balance seats..... ="+seats);
        }
        else{
            System.out.println(passenger+"seats not available....");
        }
    }
     synchronized void balanceSeats() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("available....:"+availableSeats);
    }
}
