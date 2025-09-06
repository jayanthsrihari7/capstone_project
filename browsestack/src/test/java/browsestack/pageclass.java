package browsestack;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class pageclass {
    WebDriver driver;

    // Locators
    private By usernameDropdown = By.id("username");
    private By passwordDropdown = By.id("password");
    private By loginButton = By.id("login-btn");
    private By searchBox = By.cssSelector("input[placeholder='Search']");
    private By addToCartBtn = By.xpath("//*[@id='1']/div[4]");
    private By removeBtn = By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[2]/div/div[1]");
    private By favoriteBtn = By.xpath("//*[@id=\"1\"]/div[1]/button");
    private By signOutBtn = By.id("signin");

    // Checkout locators
    private By checkoutBtn = By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[3]/div[3]");
    private By firstName = By.id("firstNameInput");
    private By lastName = By.id("lastNameInput");
    private By address = By.id("addressLine1Input");
    private By province = By.id("provinceInput");
    private By postalCode = By.id("postCodeInput");
    private By continueShippingBtn = By.id("checkout-shipping-continue");

    public pageclass(WebDriver driver) {
        this.driver = driver;
    }

    public void openUrl(String url) {
        driver.get(url);
    }

    public void login() throws InterruptedException {
        driver.findElement(usernameDropdown).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[text()='demouser']")).click();
        Thread.sleep(1000);

        driver.findElement(passwordDropdown).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
        Thread.sleep(1000);

        driver.findElement(loginButton).click();
        Thread.sleep(2000);
    }

    public void searchProduct() throws InterruptedException {
        WebElement search = driver.findElement(searchBox);
        search.clear();
        search.sendKeys("iPhone");   
        Thread.sleep(3000);          
    }
    

    public void addToCart() throws InterruptedException {
        driver.findElement(addToCartBtn).click();
        Thread.sleep(2000);
    }

    public void removeFromCart() throws InterruptedException {
        driver.findElement(removeBtn).click();
        Thread.sleep(2000);
    }
    
    // Checkout (Orders)
    public void checkout(String fname, String lname, String addr, String state, String pcode) throws InterruptedException {
    	Thread.sleep(3000);
        driver.findElement(checkoutBtn).click();
        Thread.sleep(1000);

        driver.findElement(firstName).sendKeys(fname);
        driver.findElement(lastName).sendKeys(lname);
        driver.findElement(address).sendKeys(addr);
        driver.findElement(province).sendKeys(state);
        driver.findElement(postalCode).sendKeys(pcode);

        driver.findElement(continueShippingBtn).click();
        Thread.sleep(2000);
    }
    public void addToFavorites() throws InterruptedException {
        driver.findElement(favoriteBtn).click();
        Thread.sleep(2000);
    }

    public void signOut() throws InterruptedException {
        driver.findElement(signOutBtn).click();
        Thread.sleep(2000);
    }   
}