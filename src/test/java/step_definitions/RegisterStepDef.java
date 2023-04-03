package step_definitions;

import PageObject.LandingPage;
import PageObject.LoginPage;
import PageObject.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class RegisterStepDef {
    public WebDriver webDriver;
    public RegisterStepDef(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("^open the website Lapak UMKM$")
    public void openTheWebsiteLapakUMKM() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        Assert.assertTrue(landingPage.verifyLandingPage());
        Thread.sleep(4000);
    }

    @When("^click the profile icon$")
    public void clickTheProfileIcon() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.setBtnProfile();
        Thread.sleep(4000);
    }

    @Then("^click enter icon$")
    public void clickEnterIcon() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.setBtnEnter();
        Thread.sleep(4000);
    }

    @And("^already on the login page$")
    public void alreadyOnTheLoginPage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyloginPage());
        Thread.sleep(4000);

    }

    @And("^click regis button$")
    public void clickRegisterButton() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,50)", "");
        Thread.sleep(1000);
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setBtnRegis();
        Thread.sleep(4000);
    }

    @Then("^already on the register page$")
    public void alreadyOnTheRegisterPage() throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(webDriver);
        Assert.assertTrue(registerPage.verifyRegisterPage());
        Thread.sleep(4000);
    }

    @And("^input full name \"([^\"]*)\" and email \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void inputFullNameAndEmailAndPassword(String name, String mail, String pwd) {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.setFullNameRegis(name);
        registerPage.setEmailRegis(mail);
        registerPage.setPasswordRegis(pwd);
    }

    @Then("^click register button$")
    public void clickRegisButton() throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.setBtnRegister();
        Thread.sleep(3000);
    }

    @And("^already on dashboard page$")
    public void alreadyOnDashboardPage() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        Assert.assertTrue(landingPage.verifyDsbpage());
        Thread.sleep(4000);
    }


}
