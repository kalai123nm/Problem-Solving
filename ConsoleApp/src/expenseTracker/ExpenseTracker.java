package expenseTracker;

import java.util.Scanner;

import expenseTracker.controller.TransactionController;

public class ExpenseTracker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new TransactionController(sc).start();
    }
}
