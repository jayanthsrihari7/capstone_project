package browsestack;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;   
import io.cucumber.java.en.*;

public class search {
    WebDriver driver;
    pageclass page;   // match your actual class name

    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        page = new pageclass(driver);
        page.openUrl("https://bstackdemo.com/");
    }

    @When("user searches for product")
    public void user_searches_for_product() throws InterruptedException {
        page.searchProduct();  
    }

    @Then("search results should display products")
    public void search_results_should_display_products() {
        System.out.println("Search successful!");
        driver.quit();
    }
}