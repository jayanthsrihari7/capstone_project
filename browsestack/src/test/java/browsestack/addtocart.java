package browsestack;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class addtocart {
    WebDriver driver;
    pageclass page;

    @Given("open home page for adding product")
    public void open_home_page() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        page = new pageclass(driver);
        page.openUrl("https://bstackdemo.com/");
    }

    @When("Search for a product in search bar")
    public void search_product() throws InterruptedException {
        page.searchProduct();
    }

    @And("Add the product to the cart")
    public void add_product_to_cart() throws InterruptedException {
        page.addToCart();
    }

    @Then("Successfully added to cart")
    public void added_to_cart() {
        System.out.println("Product added to cart!");
        driver.quit();
    }
}