import java.util.List;

public class TaskGroup implements Task {


    public List<SimpleTask> taskList;
    public int current = 0;

    public TaskGroup(List<SimpleTask> tasks, int currentTask) {
        this.taskList = tasks;
        this.current = currentTask;
    }

    public void addSubTask(SimpleTask task) {
        taskList.add(task);
    }

    public void removeSubTask(SimpleTask task) {
        taskList.remove(task);
    }


    @Override
    public int getStartTime() {
        return 0;
    }

    @Override
    public void setStartTime(int startTime) {

    }

    @Override
    public int getEndTime() {
        return 0;
    }

    @Override
    public void setEndTime(int endTime) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public int getNumberOfTasks() {
        current = taskList.size();
        return current;
    }

    @Override
    public void setNumberOfTasks(int numberOfTasks) {
        current = numberOfTasks;

    }
}
