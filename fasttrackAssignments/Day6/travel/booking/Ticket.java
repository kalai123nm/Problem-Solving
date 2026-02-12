package travel.booking;

public class Ticket {
    protected int ticketId;
    protected String destination;
    protected double fare;

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public void setFare(double fare) {
        this.fare = fare;
    }
    public int getTicketId() {
        return ticketId;
    }
    public String getDestination() {
        return destination;
    }
    public double getFare() {
        return fare;
    }
}
