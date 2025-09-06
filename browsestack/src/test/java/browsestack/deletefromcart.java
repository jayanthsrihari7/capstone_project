package browsestack;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class deletefromcart {
    WebDriver driver;
    pageclass page;

    @Given("user has to add product in the cart")
    public void user_add_product() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        page = new pageclass(driver);
        page.openUrl("https://bstackdemo.com/");
        page.searchProduct();
        page.addToCart();
    }

    @When("user deletes product from the cart")
    public void delete_product() throws InterruptedException {
        page.removeFromCart();
    }

    @Then("the product is sucessfully deleted")
    public void product_deleted() {
        System.out.println("Product deleted from cart");
        driver.quit();
    }
}