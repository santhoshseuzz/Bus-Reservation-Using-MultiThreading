package reservation;

import java.util.LinkedList;
import java.util.Scanner;

public class ReservationMain extends Thread{
    public static void main(String[] args) throws InterruptedException {
;
        int choice =1;
        ReservationMethods obj = new ReservationMethods();
        Scanner get= new Scanner(System.in);
        while (choice !=0) {
           System.out.print("1.Enter one to book...\n0.Exit\nEnter your  1 0r 0:::::::");
           choice = get.nextInt();
           switch (choice){
               case 1:
                   obj.add();
                   break;
               default:
                   break;
           }
       }

        obj.threadrun();
        obj.balanceSeats();

    }
}