import java.util.*;

public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> tasks;

    private ScheduleManager() {
        tasks = new ArrayList<>();
    }

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public String addTask(String description, String startTime, String endTime, String priority) {
        Task newTask = TaskFactory.createTask(description, startTime, endTime, priority);
        for (Task task : tasks) {
            if (task.conflictsWith(newTask)) {
                return "Error: Task conflicts with existing task \"" + task.getDescription() + "\".";
            }
        }
        tasks.add(newTask);
        Collections.sort(tasks, Comparator.comparing(Task::getStartTime));
        notifyObservers("Task added: " + description);
        return "Task added successfully. No conflicts.";
    }

    public String removeTask(String description) {
        for (Task task : tasks) {
            if (task.getDescription().equals(description)) {
                tasks.remove(task);
                notifyObservers("Task removed: " + description);
                return "Task removed successfully.";
            }
        }
        return "Error: Task not found.";
    }

    public String viewTasks() {
        if (tasks.isEmpty()) {
            return "No tasks scheduled for the day.";
        }
        StringBuilder sb = new StringBuilder();
        for (Task task : tasks) {
            sb.append(task).append("\n");
        }
        return sb.toString().trim();
    }

    public void notifyObservers(String message) {
        
        System.out.println("Notification: " + message);
    }
}

