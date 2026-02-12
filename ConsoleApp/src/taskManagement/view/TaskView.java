package taskManagement.view;

public class TaskView {

    public void showMenu() {
        System.out.println("\n--- TASK MANAGEMENT ---");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Update Task");
        System.out.println("4. Delete Task");
        System.out.println("5. Mark Completed");
        System.out.println("6. Filter by Priority");
        System.out.println("7. Filter by Status");
        System.out.println("8. Exit");
    }
    public void showMessage(String msg) {
        System.out.println(msg);
    }
}