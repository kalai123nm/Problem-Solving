package expenseTracker.model;

import java.time.LocalDate;

public class Transaction {

    private int id;
    private String category;
    private double amount;
    private TransactionType type;
    private LocalDate date;

    public Transaction(int id, String category, double amount,
                       TransactionType type, LocalDate date) {
        this.id = id;
        this.category = category;
        this.amount = amount;
        this.type = type;
        this.date = date;
    }

    public int getId() { return id; }
    public String getCategory() { return category; }
    public double getAmount() { return amount; }
    public TransactionType getType() { return type; }
    public LocalDate getDate() { return date; }

    public void setCategory(String category) { this.category = category; }
    public void setAmount(double amount) { this.amount = amount; }

    public String toString() {
        return id + " | " + category + " | " + amount +
               " | " + type + " | " + date;
    }
}
