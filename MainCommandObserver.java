//observer_com
// Main class to demonstrate Observer and Command Patterns
public class MainCommandObserver {
    public static void main(String[] args) {
        // Observer Pattern demonstration
        TaskNotifier notifier = new TaskNotifier();
        User user1 = new User("Alice");
        User user2 = new User("Bob");
        notifier.addObserver(user1);
        notifier.addObserver(user2);
        
        // Singleton and Factory
        ScheduleManager manager = ScheduleManager.getInstance();
        TaskFactory taskFactory = new TaskFactory();
        Task task1 = taskFactory.createTask("Complete the assignment", "high");

        // Notify users of new task
        notifier.notifyObservers("New task added: " + task1.getDescription());

        // Command Pattern demonstration
        TaskCommand addTask = new AddTaskCommand(manager, task1);
        addTask.execute();  // Add task via command

        TaskCommand removeTask = new RemoveTaskCommand(manager, task1);
        removeTask.execute();  // Remove task via command

        // Notify users of task removal
        notifier.notifyObservers("Task removed: " + task1.getDescription());
    }
}
// """

// # This implements the Observer pattern for task notifications and the Command pattern for adding/removing tasks.
// # Moving next to Adapter and Decorator patterns.