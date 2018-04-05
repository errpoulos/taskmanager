import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleTaskTest {

    @Test
    void getStartTimeTest() {
        SimpleTask st = new SimpleTask(0, 10, "taskInstance");
        int start = 0;
        st.getStartTime();
        assertEquals(start, st.getStartTime());
    }

    @Test
    void setStartTimeTest() {
        SimpleTask st = new SimpleTask(0, 10, "taskInstance");
        int start = 0;
        st.setStartTime(0);
        assertEquals(start, st.startTime);
    }

    @Test
    void getEndTimeTest() {
        SimpleTask st = new SimpleTask(0, 10, "taskInstance");
        int end = 10;
        st.getStartTime();
        assertEquals(end, st.getEndTime());
    }

    @Test
    void setEndTimeTest() {
        SimpleTask st = new SimpleTask(0, 10, "taskInstance");
        int end = 10;
        st.setEndTime(10);
        assertEquals(end, st.getEndTime());

    }

    @Test
    void getNameTest() {
        SimpleTask st = new SimpleTask(0, 10, "taskInstance");
        String name = "taskInstance";
        st.getName();
        assertEquals(name, st.name);
    }

    @Test
    void setNameTest() {
        SimpleTask st = new SimpleTask(0, 10, "taskName");
        String name = "taskName";
        st.setName("taskName");
        assertEquals(name, st.getName());
    }

    @Test
    void getNumberOfTasksTest() {
        SimpleTask st = new SimpleTask(0, 10, "taskInstance");
        assertEquals(st.numberOfSubTasks, 1);

    }

    @Test
    void setNumberOfTasksTest() {
        SimpleTask st = new SimpleTask(0, 10, "taskInstance");
        int numOfTasks = 1;
        assertEquals(numOfTasks, st.numberOfSubTasks);
    }

    @Test
    void startTimeGreaterThanEndTimeTest() throws RuntimeException {

        SimpleTask st = new SimpleTask(1, 2, "taskInstance");
        st.setEndTime(0);
        if (st.getEndTime() < st.getStartTime()) {
            throw new RuntimeException("Start time must be less than end time");
        }
    }
}