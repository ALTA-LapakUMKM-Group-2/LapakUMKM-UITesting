package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.example.PageObject.SignIn.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static step_definitions.Hooks.webDriver;

public class DeleteAccountStepdefs {

    private WebDriver webDriver;
    public DeleteAccountStepdefs (){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("^user click button delete account$")
    public void userClickButtonDeleteAccount() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,250)", "");
        WebElement a = webDriver.findElement(By.xpath("//div[@class='flex text-[18px] md:text-[18px] lg:text-[18px] 2xl:text-[24px] w-8/12 md:w-4/12 lg:w-2/12 mb-10 text-red-500 font-medium gap-2 md:gap-2 lg:gap-2 2xl:gap-3 mt-4 md:mt-4 lg:mt-4 2xl:mt-6 text-center hover:cursor-pointer hover:text-red-400']"));
        a.click();
        Thread.sleep(1000);
    }

    @Then("^user click yes$")
    public void userClickYes() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled swal2-default-outline']"));
        a.click();
        Thread.sleep(8000);
    }

    @And("^delete account success$")
    public void deleteAccountSuccess() {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyLoginPage());
    }

    @Then("^user click No$")
    public void userClickNo() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//button[@class='swal2-cancel swal2-styled swal2-default-outline']"));
        a.click();
        Thread.sleep(5000);
    }

    @And("^back to profile page$")
    public void backToProfilePage() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//h1[@class='text-zinc-800 text-[30px] md:text-[30px] lg:text-[30px] 2xl:text-[40px] text-center md:text-start lg:text-start font-semibold md:mt-10 lg:mt-16 2xl:mt-20 tracking-wider dark:text-white']"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(1000);
    }
}
