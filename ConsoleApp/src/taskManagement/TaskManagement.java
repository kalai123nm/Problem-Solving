package taskManagement;

import java.util.Scanner;

import taskManagement.controller.TaskController;

public class TaskManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new TaskController(sc).start();
    }
}
