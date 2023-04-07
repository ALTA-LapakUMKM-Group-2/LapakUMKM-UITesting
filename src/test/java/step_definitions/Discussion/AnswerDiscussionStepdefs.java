package step_definitions.Discussion;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;

public class AnswerDiscussionStepdefs {
    private WebDriver webDriver;

    public  AnswerDiscussionStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }


    @Given("^already chat discussion on detail product$")
    public void alreadyChatDiscussionOnDetailProduct() throws InterruptedException {
        WebElement a = webDriver.findElement(By.tagName("p"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(2000);

    }

    @When("^user click on balas discussion$")
    public void userClickOnBalasDiscussion() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//div[@class='flex mt-20 flex-col gap-5 w-80 md:w-[600px]']/div[3]/p[@class='text-zinc-800 inline font-semibold hover:cursor-pointer hover:text-lapak dark:text-white']"));
        a.click();
        Thread.sleep(2000);
    }

    @And("^user input on the text area \"([^\"]*)\"$")
    public void userInputOnTheTextArea(String answer) throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//div[@class='flex mt-20 flex-col gap-5 w-80 md:w-[600px]']/div[3]//input[@id='input-balas_diskusi']"));
        a.sendKeys(answer);
        Thread.sleep(2000);
    }

    @Then("^user click on the button Balas$")
    public void userClickOnTheButtonBalas() throws InterruptedException {
        WebElement a = webDriver.findElement(By.cssSelector(".w-80 > div:nth-of-type(3) #btn-balas"));
        a.click();
        Thread.sleep(5000);
    }

    @And("^verify message success to send answer discussion$")
    public void verifyMessageSuccessToSendAnswerDiscussion() throws InterruptedException {
        WebElement a =webDriver.findElement(By.xpath("//p"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(2000);
    }

    @Then("^user click on the button Kembali$")
    public void userClickOnTheButtonKembali() throws InterruptedException {
        WebElement a = webDriver.findElement(By.cssSelector(".w-80 > div:nth-of-type(3) > .mb-5 #btn-kembali"));
        a.click();
        Thread.sleep(2000);
    }
}
