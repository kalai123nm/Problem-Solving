import java.util.ArrayList;
import java.util.Scanner;
public class TicketQn05{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        ArrayList<Bus> busArray=new ArrayList<>();
        ArrayList<Train> trainArray=new ArrayList<>();
        ArrayList<Flight> flightArray=new ArrayList<>();
        
        int num=0;
        do {
            System.out.println("\n=== Travel Menu ===");
            System.out.println("1. Bus Service.");
            System.out.println("2. Train Service.");
            System.out.println("3. Flight Service.");
            System.out.println("4. Details of all Bus ticket bookings.");
            System.out.println("5. Details of all Train ticket bookings.");
            System.out.println("6. Details of all Flight ticket bookings.");
            System.out.println("7. Exit.");
            num=scan.nextInt();

            switch (num) {
                case 1:
                    Bus bus=new Bus();
                    bus.bookingTicket(scan);
                    busArray.add(bus); for (Bus bus2 : busArray) {
                        System.out.println(bus2);
                    }System.out.println("Your bus ticket has been booked successfully.");
                    break;
                case 2:
                    Train train=new Train();
                    train.bookingTicket(scan);
                    trainArray.add(train); for (Train train2 : trainArray) {
                        System.out.println(train2);
                    }System.out.println("Your train ticket has been booked successfully.");
                    break;   
                case 3:
                    Flight flight=new Flight();
                    flight.bookingTicket(scan);
                    flightArray.add(flight); for (Flight flight2 : flightArray) {
                        System.out.println(flight2);
                    }System.out.println("Your flight ticket has been booked successfully.");
                    break;
                case 4:
                    if((busArray.isEmpty())) System.out.println("No bookings found.");
                    else{for (Bus bus2 : busArray) System.out.println(bus2);}
                    break;
                case 5:
                    if((trainArray.isEmpty())) System.out.println("No bookings found.");
                    else{for (Train train2 : trainArray) System.out.println(train2);}
                    break;
                case 6:
                    if((flightArray.isEmpty())) System.out.println("No bookings found.");
                    else{for (Flight flight2 : flightArray) System.out.println(flight2);}
                    break;
                case 7:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Choose the valid option.");
                    break;
            }
        } while (num!=7);
        
        scan.close();
    }
}
abstract class Ticket{

    int fare;
    public void bookingTicket(Scanner scan){}
}
class Bus extends Ticket{
    String name, gender, seat;
    int numOfT;
    int busFare = 100;
    @Override
    public void bookingTicket(Scanner scan) {
        scan.nextLine();
        System.out.println("\n-----Bus ticket Booking system-----");
        System.out.print("Enter Your Name: ");
        this.name=scan.nextLine();
        System.out.print("Enter Your Gender: ");
        this.gender=scan.nextLine();
        System.out.print("Enter the seat Type: ");
        this.seat=scan.nextLine();
        System.out.print("How many Tickets? ");
        this.numOfT=scan.nextInt();
        scan.nextLine();
        System.out.println();
    }

    @Override
    public String toString() {
        return ("Bus Ticket: \nName: " + name + " \nGender: " + gender + " \nSeat: " + seat + " \nTickets: " + numOfT + " \nFare: " + (numOfT * busFare));
    }
}
class Train extends Ticket{
    String name, gender, seat;
    int numOfT;
    int busFare = 500;
    @Override
    public void bookingTicket(Scanner scan){
        scan.nextLine();
        System.out.println("-----Train ticket Booking system-----");
        System.out.print("Enter Your Name: ");
        this.name=scan.nextLine();
        System.out.print("Enter Your Gender: ");
        this.gender=scan.nextLine();
        System.out.print("Enter the seat Type: ");
        this.seat=scan.nextLine();
        System.out.print("How many Tickets? ");
        this.numOfT=scan.nextInt();
        scan.nextLine();
        System.out.println();
    }
    @Override
    public String toString() {
        return ("Train Ticket: \nName: " + name + " \nGender: " + gender + " \nSeat: " + seat + " \nTickets: " + numOfT + " \nFare: " + (numOfT * busFare));
    }
}
class Flight extends Ticket{
    String name, gender, seat;
    int numOfT;
    int busFare = 1000;
    @Override
    public void bookingTicket(Scanner scan){
        scan.nextLine();
        System.out.println("-----Flight ticket Booking system-----");
        System.out.print("Enter Your Name: ");
        this.name=scan.nextLine();
        System.out.print("Enter Your Gender: ");
        this.gender=scan.nextLine();
        System.out.print("Enter the seat Type: ");
        this.seat=scan.nextLine();
        System.out.print("How many Tickets? ");
        this.numOfT=scan.nextInt();
        scan.nextLine();
        System.out.println();
    }
    @Override
    public String toString() {
        return ("Flight Ticket: \nName: " + name + " \nGender: " + gender + " \nSeat: " + seat + " \nTickets: " + numOfT + " \nFare: " + (numOfT * busFare));
    }
}
