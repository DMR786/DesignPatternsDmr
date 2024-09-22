// import java.util.ArrayList;
import java.util.List;
public class MainAdapterDecorator {
    public static void main(String[] args) {
        // Adapter Pattern demonstration
        TaskImporter csvImporter = new CSVTaskImporter();
        List<Task> csvTasks = csvImporter.importTasks();

        TaskImporter jsonImporter = new JSONTaskImporter();
        List<Task> jsonTasks = jsonImporter.importTasks();

        // Process imported tasks (CSV + JSON)
        csvTasks.forEach(task -> System.out.println(task.getDescription()));
        jsonTasks.forEach(task -> System.out.println(task.getDescription()));

        // Decorator Pattern demonstration
        Task basicTask = new Task("Finish project report");
        Task deadlineTask = new DeadlineTaskDecorator(basicTask, "2024-09-30");

        System.out.println("Basic Task: " + basicTask.getDescription());
        System.out.println("Task with Deadline: " + deadlineTask.getDescription());
    }
}
