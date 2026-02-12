package taskManagement.service;

import java.util.HashMap;
import java.util.Map;

import taskManagement.model.Priority;
import taskManagement.model.Status;
import taskManagement.model.Task;

public class TaskService {

    private Map<Integer, Task> tasks = new HashMap<>();

    public void addTask(Task task) {
        tasks.put(task.getId(), task);
    }

    public Map<Integer, Task> getAllTasks() {
        return tasks;
    }

    public Task getTask(int id) {
        return tasks.get(id);
    }

    public void deleteTask(int id) {
        tasks.remove(id);
    }

    public void markCompleted(int id) {
        Task task = tasks.get(id);
        if (task != null) task.markCompleted();
    }

    public void filterByPriority(Priority p) {
        tasks.values().stream()
             .filter(t -> t.getPriority() == p)
             .forEach(System.out::println);
    }

    public void filterByStatus(Status s) {
        tasks.values().stream()
             .filter(t -> t.getStatus() == s)
             .forEach(System.out::println);
    }
}
