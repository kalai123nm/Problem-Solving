package taskManagement.model;

import java.time.LocalDate;

public class Task {

    private int id;
    private String title;
    private Priority priority;
    private LocalDate dueDate;
    private Status status;

    public Task(int id, String title, Priority priority, LocalDate dueDate) {
        this.id = id;
        this.title = title;
        this.priority = priority;
        this.dueDate = dueDate;
        this.status = Status.PENDING;
    }

    public int getId() { return id; }
    public Priority getPriority() { return priority; }
    public LocalDate getDueDate() { return dueDate; }
    public Status getStatus() { return status; }

    public void setTitle(String title) { this.title = title; }
    public void setPriority(Priority priority) { this.priority = priority; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }
    public void markCompleted() { this.status = Status.COMPLETED; }

    public String toString() {
        return id + " | " + title + " | " + priority +
               " | " + dueDate + " | " + status;
    }
}
