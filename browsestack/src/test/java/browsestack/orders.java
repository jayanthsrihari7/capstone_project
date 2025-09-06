package browsestack;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class orders {
    WebDriver driver;
    pageclass page;

    @Given("user is logged in")
    public void user_is_logged_in() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        page = new pageclass(driver);
        page.openUrl("https://bstackdemo.com/signin");
        page.login();
    }

    @When("user search and add his products to cart")
    public void user_search_and_add_products() throws InterruptedException {
        page.searchProduct();
        page.addToCart();
    }

    @When("click on checkout and enter adress")
    public void click_on_checkout_and_enter_adress() throws InterruptedException {
        page.checkout("ABC", "XYZ", "Florida, USA", "Florida", "123456");
    }


    @When("navigate to orders page")
    public void navigate_to_orders_page() throws InterruptedException {
        page.openUrl("https://bstackdemo.com/orders");
        Thread.sleep(2000);
    }

    @Then("previous orders should be displayed")
    public void previous_orders_should_be_displayed() {
        System.out.println("Orders displayed successfully");
        driver.quit();
    }
}