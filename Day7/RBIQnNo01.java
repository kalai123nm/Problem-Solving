import java.time.LocalDate;

public class RBIQnNo01 {
    public static void main(String[] args) {
        Customer c1=new Customer("kalai", "male", "kandhasamy", "9894425210", "Ezhuthur", LocalDate.of(2000,1,01));
        Account a1=new Account("9832747283912", "SBI230", "Tittakudi", 12390);
        RBI sbi=new SBI(c1, a1);
        sbi.displayCommon();
        System.out.println("Bank Name: SBI");
        System.out.println("Minimum Interestr Date: "+sbi.minInterestRate()+"\nMaximum withdrawal Limit: "+sbi.maxWithdrawalLimit()+"\nMinimum Balance: "+sbi.minBalance());
        System.out.println();
        
        Customer c2=new Customer("selvan", "male", "kandhasamy", "9892234356", "Ezhuthur", LocalDate.of(2020, 3, 10));
        Account a2=new Account("748292749122", "IDIB3403", "Thozhudhur", 122301);
        RBI indian=new Indian(c2, a2);
        indian.displayCommon();
        System.out.println("Bank Name: Indian Bank");
        System.out.println("Minimum Interestr Date: "+indian.minInterestRate()+"\nMaximum withdrawal Limit: "+indian.maxWithdrawalLimit()+"\nMinimum Balance: "+indian.minBalance());

    
    }
}
abstract class RBI{ 

    Customer customer;
    Account account;

    RBI(Customer customer, Account account){
        this.customer=customer;
        this.account=account;
    }
    public void displayCommon(){
        customer.displayCustomer();
        System.out.println();
        account.displayAccount();
    }

    public abstract int minBalance();
    public abstract long maxWithdrawalLimit();
    public abstract float minInterestRate();
    
}

class Customer{
    String uName,gender,fatherName,phoneNum,address;
    LocalDate dob;
    
    Customer(String uName,String gender,String fatherName,String phoneNum,String address, LocalDate dob){
        this.uName=uName;
        this.gender=gender;
        this.fatherName=fatherName;
        this.phoneNum=phoneNum;
        this.address=address;
        this.dob=dob;
    }
    public void displayCustomer(){
        System.err.println("----- Customer Details -----");
        System.out.println("Name: "+uName+"\nFather Name: "+fatherName+"\nGender: "+gender);
        System.out.println("Date Of Birth: "+dob+"\nPhone Number: "+phoneNum+"\nAddress: "+address);
    }
}

class Account{
    private String accNum, IFSCNum, branchName;
    private double balance;

    Account(String accNum,String IFSCNum,String branchName, double balance){
        this.accNum=accNum;
        this.IFSCNum=IFSCNum;
        this.branchName=branchName;
        this.balance=balance;
    }

    public void displayAccount(){
        System.err.println("----- Account Details -----");
        System.out.println("Branch Name: "+branchName+"\nAccount Number: "+accNum+"\nIFSC Number: "+IFSCNum+"\nAvailable Balance: $"+balance);
    }
}

class SBI extends RBI{

    SBI(Customer customer, Account account) {
        super(customer, account);
        
    }
    @Override
    public float minInterestRate() {
        return 4.6f;
    }  
    @Override
    public int minBalance() {
        return 1000;
    }
    @Override
    public long maxWithdrawalLimit() {
        return 300000;
    }
      
}
class Indian extends RBI{

    Indian(Customer customer, Account account) {
        super(customer, account);
       
    }
    @Override
    public float minInterestRate() {
        return 4.2f;
    }  
    @Override
    public int minBalance() {
        return 500;
    }
    @Override
    public long maxWithdrawalLimit() {
        return 100000;
    }
}
