package browsestack;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class signout {
    WebDriver driver;
    pageclass page;

    @Given("user first log in")
    public void user_first_log_in() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        page = new pageclass(driver);
        page.openUrl("https://bstackdemo.com/signin");
        page.login();
    }

    @When("user clicks the sign out button")
    public void user_clicks_the_sign_out_button() throws InterruptedException {
        page.openUrl("https://bstackdemo.com/favourites");
        page.signOut();
    }

    @Then("user should be redirected to the login page")
    public void user_should_be_redirected_to_the_login_page() {
        System.out.println("Signed out successfully");
        driver.quit();
    }
}