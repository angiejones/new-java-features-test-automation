package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.TodosPage;

public class BaseTests {

    private WebDriver driver;
    protected TodosPage todosPage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://todomvc-app-for-testing.surge.sh/");
        todosPage = new TodosPage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
