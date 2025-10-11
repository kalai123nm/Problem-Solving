package travel.user;    
import travel.booking.Ticket;
public class User {
    
    private String userName,gender;
    private int userId;

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getGender() {
        return gender;
    }
    public int getUserId() {
        return userId;
    }
    public String getUserName() {
        return userName;
    }

    public void bookTicket(Ticket tic){
        
        System.out.println("----- Booking Confirmation -----");
        System.out.println("User Name   : " + userName);
        System.out.println("Gender      : " + gender);
        System.out.println("User ID     : " + userId);
        System.out.println("Ticket ID   : " + tic.getTicketId());
        System.out.println("Destination : " + tic.getDestination());
        System.out.println("Fare        : ₹" + tic.getFare());
        System.out.println("--------------------------------");
        //userName=scan.next();
    }
}
