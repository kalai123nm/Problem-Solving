//import javax.naming.AuthenticationException;
import java.util.Scanner;
public class LoginSystemQn08 {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        LoginSystemQn08 logiSys=new LoginSystemQn08();
        try {
            logiSys.loginSystem(scan);
        } catch (AuthenticationException e) {
            System.out.println("Login failed. "+e.getMessage());
        }finally{
            scan.close();
        }
    }
    void loginSystem(Scanner scan) throws AuthenticationException{
        String userName="kalaikalai";
        String passWord="Kalai#122";

        System.out.print("Enter the UserName: ");
        String uName=scan.nextLine();
        System.out.print("Enter the PassWord: ");
        String pWord=scan.nextLine();
        
        if(!(userName.equals(uName)) || !(passWord.equals(pWord))){
            throw new AuthenticationException("Your Username or password is incorrect. Enter the valid credentials.");
        }else{
            System.out.println("You have succefully logged into your system.");
        }
    }
}

class AuthenticationException extends Exception{
    public AuthenticationException(String message){
        super(message);
    }
}
