import java.util.Scanner;
public class BankAccountQn05{
    public static void main(String Args[]){
        BankAccount bankAcc=new BankAccount();
        Scanner scan=new Scanner(System.in);
        int num=0;
        do { 
            System.out.println("Welcome to QUEENS ATM Service");
            System.out.println("1.Deposit");
            System.out.println("2.Withdrawal");
            System.out.println("3.Exit");
            System.out.println("Enter the number to choose our service");
            num=scan.nextInt();
            switch (num) {
            case 1:
                bankAcc.depositAmount(scan);
                break;
            case 2:
                bankAcc.withdrawalAmount(scan);
                break;
            case 3:
                System.out.println("Thank You for Using Our services....Exiting");
            default:
                throw new AssertionError();
            }
        } 
        while (num>=3);
        scan.close();
    }
}

class BankAccount{
    Scanner scan;
    private String accountNum;
    private String accountHolderName;
    private double balance=1000;
    int depositAmount;
    int withdrawalAmount;

    public void setAccountNum(String accountNum){
        this.accountNum=accountNum;
    }
    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName=accountHolderName;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    //public void setDepositAmount(int depositAmount){
      //  this.depositAmount=depositAmount;
    //}
    public void setwithdrawalAmount(int withdrawalAmount){
        this.withdrawalAmount=withdrawalAmount;
    }

    public String getAccountNum(){
        return accountNum;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public double getBalance(){
        return balance;
    }
    public int getDepositAmount(){
        return depositAmount;
    }
    public int getWithdrawalAmount(){
        return withdrawalAmount;
    }

    void depositAmount(Scanner scan){
        this.scan=scan;
        System.out.print("Enter Your Account Number Please: ");
        accountNum=scan.nextLine();
        System.err.print("Enter Your Name: ");
        accountHolderName=scan.nextLine();
        System.out.print("Enter The Anount You Want To Deposit: ");
        depositAmount=scan.nextInt();
        balance+=depositAmount;
        System.out.println("Your Money Has Been Successfully Credited To Your Account.");
        System.out.println("Your current balance is: "+balance);
        System.out.println();
    }
    void withdrawalAmount(Scanner scan){
        this.scan=scan;
        System.out.print("Enter Your Account Number Please: ");
        accountNum=scan.nextLine();
        scan.nextLine();
        System.err.print("Enter Your Name: ");
        accountHolderName=scan.nextLine();
        System.out.print("Enter The Anount You Want To Withdraw: ");
        withdrawalAmount=scan.nextInt();
        if (withdrawalAmount<=balance) {
            
            balance-=withdrawalAmount;
            System.out.println("krrrr...Your Withdrawal Has Been Successfully Completed.");
            System.out.println("Your current balance is: "+balance);
        }else{
            System.out.println("You Don't Have Enough Money In Your Account...");
            System.out.println("Your current balance is: "+balance);
        }
        
    }
}