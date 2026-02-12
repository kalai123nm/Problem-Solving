import java.time.LocalDate;
public class TicketBookingQn04{
    public static void main(String[] args) {
        AllTicketBooking bus=new Bus();
        bus.bookingTicket(LocalDate.of(2025, 8, 03), "travelServiceName", "Ezhuthur", "Surandai", "kalai", "Male", "Train", "Sleeper", 01, 450);
        AllTicketBooking train=new Train(); 
        train.bookingTicket(LocalDate.of(2025,8,01), "travelServiceName", "fromLocation", "toLocation", "passengerName", "gender", "travelMode", "seatType", 6, 2340);
        AllTicketBooking flight=new Flight();
        flight.bookingTicket(LocalDate.of(2025,9,01), "Radhammm", "Trichy", "Tenkasi", "FirstName", "Female", "Vibrant", "Sleeper", 2, 890);
    }
}
class AllTicketBooking{
    LocalDate date;
    String fromLocation,toLocation,passengerName,travelMode,seatType;
    String travelServiceName,gender;
    int numOfTicket;
    Double ticketPrice;

    public void bookingTicket(LocalDate date,String travelServiceName,String fromLocation, String toLocation,
    String passengerName,String gender, String travelMode,String seatType,int numOfTicket,double ticketPrice){
        this.date=date;
        this.travelServiceName=travelServiceName;
        this.fromLocation=fromLocation;
        this.toLocation=toLocation;
        this.passengerName=passengerName;
        this.gender=gender;
        this.travelMode=travelMode;
        this.seatType=seatType;
        this.numOfTicket=numOfTicket;
        this.ticketPrice=ticketPrice;

        System.out.println("Booking Details: \n");
        System.out.println("Date: "+date+"\nPassenger Name: "+passengerName+"\nGender: "+gender+"\nTravel Mode: "+travelMode+
        "\nTravel Service Name: "+travelServiceName+"\nFrom Location: "+fromLocation+"\nTo Location: "+toLocation+"\nSeat Type: "+seatType+
        "\nTicket Price: "+ticketPrice+"\nNumber Of Ticket: "+numOfTicket);
        System.out.println("Total Price Of "+numOfTicket+" Tickets: "+(numOfTicket*ticketPrice));
    }

}

class Bus extends AllTicketBooking{

    @Override
    public void bookingTicket(LocalDate date,String travelServiceName,String fromLocation, String toLocation,
    String passengerName,String gender, String travelMode,String seatType,int numOfTicket,double ticketPrice) {
        System.out.println("-----Bus ticket Booking system-----");
        super.bookingTicket(date, travelServiceName, fromLocation, toLocation, passengerName, gender, travelMode, seatType, numOfTicket, ticketPrice);
    }
}

class Train extends AllTicketBooking{

    @Override
    public void bookingTicket(LocalDate date,String travelServiceName,String fromLocation, String toLocation,
    String passengerName,String gender, String travelMode,String seatType,int numOfTicket,double ticketPrice){
        System.out.println("-----Train ticket Booking system-----");
        super.bookingTicket(date, travelServiceName, fromLocation, toLocation, passengerName, gender, travelMode, seatType, numOfTicket, ticketPrice);;
    }
}

class Flight extends AllTicketBooking{

    @Override
    public void bookingTicket(LocalDate date,String travelServiceName,String fromLocation, String toLocation,
    String passengerName,String gender, String travelMode,String seatType,int numOfTicket,double ticketPrice){
        System.out.println("-----Flight ticket Booking system-----");
        super.bookingTicket(date, travelServiceName, fromLocation, toLocation, passengerName, gender, travelMode, seatType, numOfTicket, ticketPrice);;
    }
}