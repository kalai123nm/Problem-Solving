package expenseTracker.service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import expenseTracker.model.Transaction;
import expenseTracker.model.TransactionType;

public class TransactionService {

    private Map<Integer, Transaction> transactions = new HashMap<>();

    public void addTransaction(Transaction t) {
        transactions.put(t.getId(), t);
    }

    public Map<Integer, Transaction> getAll() {
        return transactions;
    }

    public Transaction getById(int id) {
        return transactions.get(id);
    }

    public void delete(int id) {
        transactions.remove(id);
    }

    public double getBalance() {
        double balance = 0;
        for (Transaction t : transactions.values()) {
            if (t.getType() == TransactionType.INCOME)
                balance += t.getAmount();
            else
                balance -= t.getAmount();
        }
        return balance;
    }

    public void filterByCategory(String category) {
        transactions.values().stream()
            .filter(t -> t.getCategory().equalsIgnoreCase(category))
            .forEach(System.out::println);
    }

    public void filterByType(TransactionType type) {
        transactions.values().stream()
            .filter(t -> t.getType() == type)
            .forEach(System.out::println);
    }

    public void filterByDate(LocalDate date) {
        transactions.values().stream()
            .filter(t -> t.getDate().equals(date))
            .forEach(System.out::println);
    }
}
