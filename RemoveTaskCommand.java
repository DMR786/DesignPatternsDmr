class RemoveTaskCommand implements TaskCommand {
    private ScheduleManager manager;
    private Task task;

    public RemoveTaskCommand(ScheduleManager manager, Task task) {
        this.manager = manager;
        this.task = task;
    }

    @Override
    public void execute() {
        manager.removeTask(task);
    }
}
