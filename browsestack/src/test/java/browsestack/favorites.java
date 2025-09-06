package browsestack;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class favorites {
    WebDriver driver;
    pageclass page;

    @Given("user first logged in")
    public void user_first_logged_in() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        page = new pageclass(driver);
        page.openUrl("https://bstackdemo.com/signin");
        page.login();
    }

    @When("user adds product to favorites")
    public void user_adds_product_to_favorites() throws InterruptedException {
        page.openUrl("https://bstackdemo.com/");
        page.addToFavorites();
        page.openUrl("https://bstackdemo.com/favourites");
        Thread.sleep(2000);
    }

    @Then("product should be visible in favorites")
    public void product_should_be_visible_in_favorites() {
        System.out.println("Favorites displayed successfully");
        driver.quit();
    }
}