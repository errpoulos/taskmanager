public class SimpleTask implements Task {
    //testComment

    static int startTime;
    static int endTime;
    protected String name;
    int numberOfSubTasks = 1;

    public SimpleTask(int startTime, int endTime, String name) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.name = name;
    }

    @Override
    public int getStartTime() {
        return startTime;
    }

    @Override
    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    @Override
    public int getEndTime() {
        return endTime;
    }

    @Override
    public void setEndTime(int endTime) {
        this.endTime = endTime;

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public int getNumberOfTasks() {
        return numberOfSubTasks;
    }

    @Override
    public void setNumberOfTasks(int numberOfTasks) {
        numberOfSubTasks = 1;

    }
}
