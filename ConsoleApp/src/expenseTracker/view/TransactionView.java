package expenseTracker.view;

public class TransactionView {

    public void showMenu() {
        System.out.println("\n--- EXPENSE TRACKER ---");
        System.out.println("1. Add Transaction");
        System.out.println("2. View All Transactions");
        System.out.println("3. Update Transaction");
        System.out.println("4. Delete Transaction");
        System.out.println("5. View Balance");
        System.out.println("6. Filter by Category");
        System.out.println("7. Filter by Type");
        System.out.println("8. Filter by Date");
        System.out.println("9. Exit");
    }

    public void showMessage(String msg) {
        System.out.println(msg);
    }
}
