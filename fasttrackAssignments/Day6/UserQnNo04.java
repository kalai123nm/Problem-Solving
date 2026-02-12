import java.util.Scanner;

import travel.booking.Ticket;
import travel.user.User;
public class UserQnNo04 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        Ticket tic=new Ticket();
        System.out.println("Enter your Destination: ");
        tic.setDestination(scan.nextLine());
        System.out.println("Enter your TicketID: ");
        tic.setTicketId(scan.nextInt());
        System.out.println("Enter Fare: ");
        tic.setFare(scan.nextDouble());
        scan.nextLine();

        User use=new User();
        System.out.println("Enter your Name: ");
        use.setUserName(scan.nextLine());
        System.out.println("Enter your Gender: ");
        use.setGender(scan.nextLine());
        //scan.nextLine();
        System.out.println("Enter your UserID: ");
        use.setUserId(scan.nextInt());
        use.bookTicket(tic);

        scan.close();
    }
}
