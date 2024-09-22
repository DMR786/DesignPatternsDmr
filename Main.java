// Main class to demonstrate Singleton and Factory Patterns
public class Main {
    public static void main(String[] args) {
        // Singleton usage
        ScheduleManager manager = ScheduleManager.getInstance();
        
        // Factory usage
        TaskFactory taskFactory = new TaskFactory();
        Task task1 = taskFactory.createTask("Complete the assignment", "high");
        Task task2 = taskFactory.createTask("Buy groceries", "low");
        
        // Managing tasks
        manager.addTask(task1);
        manager.addTask(task2);
        manager.displayTasks();
        manager.removeTask(task1);
    }
}
// """

// # Code ready for the Singleton and Factory patterns; moving on to Observer and Command patterns next.
// # This will demonstrate task management using both the Singleton ScheduleManager and TaskFactory.


