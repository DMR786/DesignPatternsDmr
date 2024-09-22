class DeadlineTaskDecorator extends TaskDecorator {
    private String deadline;

    public DeadlineTaskDecorator(Task task, String deadline) {
        super(task);
        this.deadline = deadline;
    }

    @Override
    public String getDescription() {
        return task.getDescription() + " (Deadline: " + deadline + ")";
    }
}
