// Factory Pattern: TaskFactory to create tasks
class TaskFactory {
    public Task createTask(String description, String priority) {
        if (priority.equalsIgnoreCase("high")) {
            return new HighPriorityTask(description);
        } else if (priority.equalsIgnoreCase("low")) {
            return new LowPriorityTask(description);
        } else {
            return new Task(description); // Default Task
        }
    }
}