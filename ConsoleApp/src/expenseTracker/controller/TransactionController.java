package expenseTracker.controller;

import java.time.LocalDate;
import java.util.Scanner;

import expenseTracker.model.Transaction;
import expenseTracker.model.TransactionType;
import expenseTracker.service.TransactionService;
import expenseTracker.view.TransactionView;

public class TransactionController {

    private Scanner sc;
    private TransactionService service;
    private TransactionView view;

    public TransactionController(Scanner sc) {
        this.sc = sc;
        this.service = new TransactionService();
        this.view = new TransactionView();
    }

    public void start() {

        int choice;
        do {
            view.showMenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1: addTransaction(); break;
                case 2: service.getAll().values().forEach(System.out::println); break;
                case 3: updateTransaction(); break;
                case 4: deleteTransaction(); break;
                case 5: view.showMessage("Balance: " + service.getBalance()); break;
                case 6: filterByCategory(); break;
                case 7: filterByType(); break;
                case 8: filterByDate(); break;
                case 9: view.showMessage("Goodbye!"); break;
                default: view.showMessage("Invalid choice");
            }

        } while (choice != 9);
    }

    private void addTransaction() {
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Category: ");
        String category = sc.nextLine();

        System.out.print("Amount: ");
        double amount = sc.nextDouble();

        System.out.print("Type (INCOME/EXPENSE): ");
        TransactionType type =
            TransactionType.valueOf(sc.next().toUpperCase());

        System.out.print("Date (yyyy-mm-dd): ");
        LocalDate date = LocalDate.parse(sc.next());

        service.addTransaction(
            new Transaction(id, category, amount, type, date)
        );
        view.showMessage("Transaction added");
    }

    private void updateTransaction() {
        System.out.print("Transaction ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        Transaction t = service.getById(id);
        if (t == null) {
            view.showMessage("Transaction not found");
            return;
        }

        System.out.print("New Category: ");
        t.setCategory(sc.nextLine());

        System.out.print("New Amount: ");
        t.setAmount(sc.nextDouble());

        view.showMessage("Transaction updated");
    }

    private void deleteTransaction() {
        System.out.print("Transaction ID: ");
        service.delete(sc.nextInt());
        view.showMessage("Transaction deleted");
    }

    private void filterByCategory() {
        System.out.print("Category: ");
        service.filterByCategory(sc.next());
    }

    private void filterByType() {
        System.out.print("Type (INCOME/EXPENSE): ");
        service.filterByType(
            TransactionType.valueOf(sc.next().toUpperCase())
        );
    }

    private void filterByDate() {
        System.out.print("Date (yyyy-mm-dd): ");
        service.filterByDate(LocalDate.parse(sc.next()));
    }
}
