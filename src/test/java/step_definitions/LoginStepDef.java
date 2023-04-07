package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.example.PageObject.SignIn.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static step_definitions.Hooks.webDriver;

public class LoginStepDef {
    @Given("^Open the website LapakUMKM$")
    public void openTheWebsiteLapakUMKM() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//div[@class='dropdown dropdown-end']//div[@class='avatar']"));
        a.click();
        WebElement b = webDriver.findElement(By.xpath("//a[.='Masuk']"));
        b.click();
        Thread.sleep(2000);
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyLoginPage());
        Thread.sleep(2000);
    }

    @When("^input email \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void inputEmailAndPassword(String email, String pswd) {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setEmailSignIn(email);
        loginPage.setPasswordSignIn(pswd);
    }

    @Then("^click button login$")
    public void clickButtonLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setBtnLogin();
        Thread.sleep(5000);
    }

    @And("^already on Dashboard page$")
    public void alreadyOnDashboardPage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyDashboardPage());
        Thread.sleep(8000);
    }
}
