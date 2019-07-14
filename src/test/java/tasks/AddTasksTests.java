package tasks;

import base.BaseTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

public class AddTasksTests extends BaseTests {

    @Test
    public void addTasks(){

        var tasks = List.of(
                "pay mortgage bill",
                "make dentist appointment",
                "get car washed");
        tasks.forEach(todosPage::addTask);

        var addedTasksList = todosPage.getAllTasks();
        assertTrue(addedTasksList.containsAll(tasks), "Task items");
        assertEquals(addedTasksList.size(), tasks.size(), "Number of tasks");
    }
}