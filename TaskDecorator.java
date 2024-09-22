abstract class TaskDecorator extends Task {
    protected Task task;

    public TaskDecorator(Task task) {
        super(task.getDescription());
        this.task = task;
    }

    @Override
    public String getDescription() {
        return task.getDescription();
    }
}

