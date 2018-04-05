import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskGroupTest {

    @Test
    void getNumberOfTasksTest() {
        SimpleTask st = new SimpleTask(0, 10, "taskInstance");
        List<SimpleTask> List = new ArrayList<>();
        TaskGroup taskGroup = new TaskGroup(List, 0);
        List.add(st);
        assertEquals(List.size(), taskGroup.getNumberOfTasks());
    }

    @Test
    void setNumberOfTasksTest() {
        SimpleTask st = new SimpleTask(0, 10, "taskInstance");
        List<SimpleTask> List = new ArrayList<>();
        TaskGroup taskGroup = new TaskGroup(List, 0);
        List.add(st);
        taskGroup.setNumberOfTasks(List.size());
        assertEquals(taskGroup.getNumberOfTasks(), List.size());
    }

    @Test
    void addSubTasktest() {
        SimpleTask st1 = new SimpleTask(0, 10, "taskName1");
        List<SimpleTask> List = new ArrayList<>();
        TaskGroup taskGroup = new TaskGroup(List, 0);
        taskGroup.addSubTask(st1);
        assertTrue(List.contains(st1));
    }

    @Test
    void removeSubTasktest() {
        SimpleTask st1 = new SimpleTask(0, 10, "taskName1");
        List<SimpleTask> List = new ArrayList<>();
        TaskGroup taskGroup = new TaskGroup(List, 0);
        taskGroup.removeSubTask(st1);
        assertFalse(List.contains(st1));
    }

    @Test
    void startTimeGreaterThanEndTimeTest() throws RuntimeException {
        List<SimpleTask> List = new ArrayList<>();
        TaskGroup taskGroup = new TaskGroup(List, 0);
        SimpleTask st = new SimpleTask(1, 2, "taskInstance");
        taskGroup.addSubTask(st);
        for (SimpleTask s : List) {
            if (s.getEndTime() < s.getStartTime()) {
                throw new RuntimeException("Start time must be less than end time");

            }

        }
    }
}
