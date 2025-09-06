package browsestack;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class signin {
    WebDriver driver;
    pageclass page;

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        page = new pageclass(driver);
        page.openUrl("https://bstackdemo.com/signin");
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() throws InterruptedException {
        page.login();
    }

    @Then("successful login")
    public void successful_login() {
        System.out.println("Login successful");
        driver.quit();
    }
}