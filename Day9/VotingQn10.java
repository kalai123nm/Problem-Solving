import java.util.InputMismatchException;
import java.util.Scanner;
public class VotingQn10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        VotingQn10 voting=new VotingQn10();
        try {
            voting.eligibleOrNot(scan);
        } catch (NotEligibleException e) {
            System.out.println(e.getMessage());
        } catch(InputMismatchException f){
            System.out.println(f.getMessage());
        } finally{
            scan.close();
        }
    }
    void eligibleOrNot(Scanner scan) throws NotEligibleException{
        System.out.print("Enter your age: ");
        
        if((scan.hasNextInt())){
            int age=scan.nextInt();

            if(age<18){
                throw new NotEligibleException("sorry, only above 18 people are eligible.");
            }else{
                System.out.println("You have successfully registered.");
            }
        }else{
            scan.next();
            throw new InputMismatchException("Enter the valid numeric input.");
            
        }
        
    }
}

class NotEligibleException extends Exception{
    public NotEligibleException(String msg){
        super(msg);
    }
}
