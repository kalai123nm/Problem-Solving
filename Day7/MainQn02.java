import java.util.Scanner;
public class MainQn02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        PaymentMethod Cpayy=new CreditCardPayment();
        PaymentMethod Dpayy=new DebitcardPayment();
        PaymentMethod Upayy=new UPIPayment();
        int num=0;
        do {
            System.out.println("\nChoose the Transaction method: ");
            System.out.println("1. CreditCard Payment.");
            System.out.println("2. DebitCard Payment.");
            System.out.println("3. UPI Payment.");
            System.out.println("4. Exitig.");
            num=scan.nextInt();
            switch (num) {
                case 1:
                    Cpayy.pay(2000);
                    break;
                case 2:
                    Dpayy.pay(30000);
                    break;
                case 3:
                    Upayy.pay(400000);
                    break;    
                case 4:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Choose the valid payment method.");
                    break;
            }
        } while (num!=4);
        scan.close();
    }
}

interface PaymentMethod{
    void pay(double amount);
}

class CreditCardPayment implements PaymentMethod{
    int creditCardNum=12345;
    long receiveAccNum=54321;
    double creditBalance=123459.0; 
    @Override
    public void pay(double amount) {
        if(amount<=creditBalance){
            creditBalance-=amount;
            System.out.println("Paid Rs."+amount+" using Creditcard.");
            System.out.println("Available balance is "+creditBalance);
        }else{
            System.out.println("oooops...Insufficient Amount.");
        }
    }
}

class DebitcardPayment implements PaymentMethod{
    long debitCardNum=98765;
    int validYear=56789;
    String cardType="Platinum";
    transient int PIN=1324;
    double debitBalance=123460.0; 

    @Override
    public void pay(double amount) {
        if(amount<=debitBalance){
            debitBalance-=amount;
            System.out.println("Paid Rs."+amount+" using Debitcard.");
            System.out.println("Available balance is "+debitBalance);
        }else{
            System.out.println("oooops...Insufficient Amount.");
        }
    }
}

class UPIPayment implements PaymentMethod{
    String uPIID="upi32kdmd";
    String userName="laika";
    transient String password="1234abc";
    double upiBalance=12340.0; 

    @Override
    public void pay(double amount) {
        if(amount<=upiBalance){
            upiBalance-=amount;
            System.out.println("Paid Rs."+amount+" using UPI.");
            System.out.println("Available balance is "+upiBalance);
        }else{
            System.out.println("oooops...Insufficient Amount.");
        }
    }
}