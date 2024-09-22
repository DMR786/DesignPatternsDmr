import java.util.ArrayList;
import java.util.List;

class CSVTaskImporter implements TaskImporter {
    @Override
    public List<Task> importTasks() {
        System.out.println("Importing tasks from CSV...");
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("CSV Task 1"));
        tasks.add(new Task("CSV Task 2"));
        return tasks;
    }
}
