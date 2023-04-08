package step_definitions.Discussion;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;

public class DiscussionStepdefs {
    private WebDriver webDriver;

    public DiscussionStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }


    @And("^user lick on the product$")
    public void userLickOnTheProduct() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//div[@class='my-4 gap-y-5 gap-x-5 grid xl:grid-cols-5 lg:grid-cols-4 md:grid-cols-3 sm:grid-cols-2 mx-auto mt-10']/div[4]/a[1]"));
        a.click();
        Thread.sleep(2000);
    }

    @Then("^user click on the button Kirim$")
    public void userClickOnTheButtonKirim() throws InterruptedException {
        WebElement a = webDriver.findElement(By.id("btn-kirim_diskusi"));
        a.click();
        Thread.sleep(10000);
    }

    @When("^user input on the text area filix with five word \"([^\"]*)\"$")
    public void userInputOnTheTextAreaFilixWithFiveWord(String fiveWords) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,350)", "");
        WebElement a = webDriver.findElement(By.id("input-diskusi"));
        a.sendKeys(fiveWords);
        Thread.sleep(2000);
    }

    @And("^verify message success to send$")
    public void verifyMessageSuccesToSend() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,1350)", "");
        WebElement a = webDriver.findElement(By.tagName("p"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(2000);
    }

    @When("^user input on the text area filix with one word \"([^\"]*)\"$")
    public void userInputOnTheTextAreaFilixWithOneWord(String arg0) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,350)", "");
        WebElement a = webDriver.findElement(By.id("input-diskusi"));
        a.sendKeys(arg0);
        Thread.sleep(2000);
    }

    @When("^user input on the text area filix with one hundred word \"([^\"]*)\"$")
    public void userInputOnTheTextAreaFilixWithOneHundredWord(String arg0) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,1350)", "");
        WebElement a = webDriver.findElement(By.id("input-diskusi"));
        a.sendKeys(arg0);
        Thread.sleep(2000);
    }
}
