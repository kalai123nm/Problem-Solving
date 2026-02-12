public class PaymentGatewayQn01{
    public static void main(String argss[]){
        PaymentGateWay paymentGWay=new PaymentGateWay();
        paymentGWay.diplayTSummary(20000, 23, "Kalai", "kane", "Online", "Pending...");
        paymentGWay.diplayTSummary(120000, 12, "suriya", "kane", "via IB", "completed.");
        paymentGWay.diplayTSummary(9000, 7, "deva", "kalai", "Online", "Pending...");
    }
}
class PaymentGateWay{
    private int 
    amount,
    transactionID;
    
    private String 
    payerName,
    payeeName,
    paymentMethod,
    transactionStatus;

    public void setAll(int amount,int transactionID, String payerName, String payeeName, String paymentMethod, String transactionStatus){
        this.amount=amount;
        this.transactionID=transactionID;
        this.payerName=payerName;
        this.payeeName=payeeName;
        this.paymentMethod=paymentMethod;
        this.transactionStatus=transactionStatus;
    }
    public int getAmount() {
        return amount;
    }
    public int getTransactionID(){
        return transactionID;
    }
    public String getPayerName() {
        return payerName;
    }
    public String getPayeeName() {
        return payeeName;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }
    public String getTransactionStatus() {
        return transactionStatus;
    }
    public void diplayTSummary(int amount,int transactionID, String payerName, String payeeName, String paymentMethod, String transactionStatus){
        this.amount=amount;
        this.transactionID=transactionID;
        this.payerName=payerName;
        this.payeeName=payeeName;
        this.paymentMethod=paymentMethod;
        this.transactionStatus=transactionStatus;

        System.out.println("\n-----Transaction Summary-----"+"\n");
        System.out.println("Transaction ID: "+transactionID+"\nPayment Method: "+paymentMethod+"\nPayer Name: "+payerName+
        "\nPayee Name: "+payeeName+"\nAmount: "+amount+"\nTransaction Status: "+transactionStatus);
        System.out.println();
    }

}
