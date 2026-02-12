package taskManagement.controller;

import java.time.LocalDate;
import java.util.Scanner;

import taskManagement.model.Priority;
import taskManagement.model.Status;
import taskManagement.model.Task;
import taskManagement.service.TaskService;
import taskManagement.view.TaskView;

public class TaskController {

    private Scanner sc;
    private TaskService service;
    private TaskView view;

    public TaskController(Scanner sc) {
        this.sc = sc;
        this.service = new TaskService();
        this.view = new TaskView();
    }

    public void start() {

        int choice = 0;

        do {
            view.showMenu();
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addTask();
                    break;

                case 2:
                    service.getAllTasks()
                            .values()
                            .forEach(System.out::println);
                    break;

                case 3:
                    updateTask();
                    break;

                case 4:
                    deleteTask();
                    break;

                case 5:
                    markCompleted();
                    break;

                case 6:
                    filterByPriority();
                    break;

                case 7:
                    filterByStatus();
                    break;

                case 8:
                    view.showMessage("Goodbye!");
                    break;

                default:
                    view.showMessage("Invalid choice");
            }

        } while (choice != 8);
    }

    private void addTask() {
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Title: ");
        String title = sc.nextLine();

        System.out.print("Priority (HIGH/MEDIUM/LOW): ");
        Priority p = Priority.valueOf(sc.next().toUpperCase());

        System.out.print("Due date (yyyy-mm-dd): ");
        LocalDate date = LocalDate.parse(sc.next());

        service.addTask(new Task(id, title, p, date));
        view.showMessage("Task added");
    }

    private void updateTask() {
        System.out.print("Task ID: ");
        int id = sc.nextInt();
        Task task = service.getTask(id);
        if (task == null) {
            view.showMessage("Task not found");
            return;
        }

        System.out.print("New title: ");
        sc.nextLine();
        task.setTitle(sc.nextLine());
    }

    private void deleteTask() {
        System.out.print("Task ID: ");
        service.deleteTask(sc.nextInt());
        view.showMessage("Task deleted");
    }

    private void markCompleted() {
        System.out.print("Task ID: ");
        service.markCompleted(sc.nextInt());
        view.showMessage("Task completed");
    }

    private void filterByPriority() {
        System.out.print("Priority: ");
        service.filterByPriority(
                Priority.valueOf(sc.next().toUpperCase()));
    }

    private void filterByStatus() {
        System.out.print("Status: ");
        service.filterByStatus(
                Status.valueOf(sc.next().toUpperCase()));
    }
}
