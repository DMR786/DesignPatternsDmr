class AddTaskCommand implements TaskCommand {
    private ScheduleManager manager;
    private Task task;

    public AddTaskCommand(ScheduleManager manager, Task task) {
        this.manager = manager;
        this.task = task;
    }

    @Override
    public void execute() {
        manager.addTask(task);
    }
}
