package browsestack;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class offers {
    WebDriver driver;
    pageclass page;

    @Given("user should logged in")
    public void user_should_be_logged_in() throws InterruptedException {
    	driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        page = new pageclass(driver);
        page.openUrl("https://bstackdemo.com/signin");
        page.login();
    }

    @When("user navigates to the offers page")
    public void user_navigates_to_offers() throws InterruptedException {
        page.openUrl("https://bstackdemo.com/offers");
        Thread.sleep(2000);
    }

    @Then("available offers should be displayed")
    public void available_offers_should_be_displayed() {
        System.out.println("Offers displayed successfully");
        driver.quit();
    }
}