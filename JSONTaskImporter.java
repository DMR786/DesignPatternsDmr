import java.util.ArrayList;
import java.util.List;

class JSONTaskImporter implements TaskImporter {
    @Override
    public List<Task> importTasks() {
        System.out.println("Importing tasks from JSON...");
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("JSON Task 1"));
        tasks.add(new Task("JSON Task 2"));
        return tasks;
    }
}
