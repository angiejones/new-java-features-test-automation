package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class TodosPage {

    private WebDriver driver;
    private By newTaskField = By.className("new-todo");
    private By tasks = By.cssSelector(".todo-list li");

    public TodosPage(WebDriver driver){
        this.driver = driver;
    }

    public void addTask(String task){
        driver.findElement(newTaskField).sendKeys(task + Keys.ENTER);
    }

    public List<String> getAllTasks(){
        return driver.findElements(tasks).stream().map(WebElement::getText).collect(Collectors.toList());
    }
}