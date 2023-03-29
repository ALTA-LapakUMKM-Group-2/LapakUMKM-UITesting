package step_definitions.ListUser;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;

public class purchaseSteps {
    private WebDriver webDriver;

    public purchaseSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @Given("User already login")
    public void userAlreadyLogin(){
        LoginPage loginPage = new LoginPage (webDriver);
        Assert.assertTrue(loginPage.verifiyLoginPage());
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLogin();

    }
@And( "User already landing page")
    public void verifyLoginPagePurchase(){
        LandingPage landingPage = new LandingPage (webDriver);
        landingPage.verifiyLogin();
    }

 @When("User sort product list by \"(.*)\"")
 public void selectProductCart(String sortProduct) throws InterruptedException {
     LandingPage landingpage = new LandingPage(webDriver);
     landingpage.sortProduct(sortProduct);
     Thread.sleep(3000);
 }
 @And ("User add item  \"(.*)\" and \"(.*)\" to cart")
 public void addtItem(String itemTshirt, String itemTshirt2) throws InterruptedException {
        addItemToCart(itemTshirt);
        addItemToCart(itemTshirt2);
     Thread.sleep(3000);
 }
    //xpath button add item with text name item
 public void addItemToCart(String itemTshirt) {
        WebElement a = webDriver.findElement(By.xpath("//div[text()='"+itemTshirt+"']/ancestor::div[@class='inventory_item_label']/following-sibling::div/button"));
        a.click();
    }
 @And("User click shopping chart icon")
    public void clickshoppingChart() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickShopcart();
        Thread.sleep(3000);
    }
}
