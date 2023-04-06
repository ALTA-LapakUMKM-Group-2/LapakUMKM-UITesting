package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.SignIn.HomePages;
import org.example.PageObject.SignIn.LoginPages;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginPageStepDef {
    private WebDriver webDriver;
    public LoginPageStepDef(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @Given("^User open the website$")
    public void userOpenTheWebsite() throws InterruptedException {
        HomePages homePages = new HomePages(webDriver);
        Assert.assertTrue(homePages.verifyHomePages());
        Thread.sleep(5000);
    }

    @When("^User click prof button$")
    public void userClickProfButton() throws InterruptedException {
        HomePages homePages = new HomePages(webDriver);
        homePages.setBtnProf();
        Thread.sleep(3000);
    }

    @Then("^User click entry button$")
    public void userClickEntryButton() throws InterruptedException {
        HomePages homePages = new HomePages(webDriver);
        homePages.setBtnEntry();
        Thread.sleep(3000);
    }

    @And("^User already on login pages$")
    public void userAlreadyOnLoginPages() throws InterruptedException {
        LoginPages loginPage = new LoginPages(webDriver);
        Assert.assertTrue(loginPage.verifyLoginPage());
        Thread.sleep(5000);
    }

    @Then("^User input email \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void userInputEmailAndPassword(String email, String pswd) throws InterruptedException {
        LoginPages loginPage = new LoginPages(webDriver);
        loginPage.setEmailSignIn(email);
        loginPage.setPasswordSignIn(pswd);
        Thread.sleep(3000);
    }

    @And("^User click button login$")
    public void userClickButtonLogin() throws InterruptedException{
        LoginPages loginPage = new LoginPages(webDriver);
        loginPage.setBtnLogin();
        Thread.sleep(3000);
    }

    @And("^User already on Dashboard pages$")
    public void userAlreadyOnDashboardPages() throws InterruptedException{
        LoginPages loginPage = new LoginPages(webDriver);
        Assert.assertTrue(loginPage.verifyDashboardPages());
        Thread.sleep(5000);
    }
}
