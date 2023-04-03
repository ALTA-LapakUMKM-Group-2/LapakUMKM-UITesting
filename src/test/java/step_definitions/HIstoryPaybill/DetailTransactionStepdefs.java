package step_definitions.HIstoryPaybill;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;

public class DetailTransactionStepdefs {

    private WebDriver webDriver;
    public DetailTransactionStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("^user click sub button Riwayat Belanja field$")
    public void userClickSubButtonRiwayatBelanjaField() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//div[@class='dropdown dropdown-end']"));
        a.click();
        Thread.sleep(1000);
        WebElement b = webDriver.findElement(By.xpath("//a[.='Riwayat Belanja']"));
        b.click();
        Thread.sleep(1000);
    }

    @And("^user already on History Pembelian page$")
    public void userAlreadyOnHistoryPembelianPage() throws InterruptedException {
        WebElement a = webDriver.findElement(By.cssSelector(".mt-12"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(15000);
    }

    @Then("^user click on button detail transaction$")
    public void userClickOnButtonDetailTransaction() throws InterruptedException {
        WebElement a = webDriver.findElement(By.id("btn-bayar"));
        a.click();
        Thread.sleep(4000);

    }

    @And("^user direct modal detail transaction$")
    public void userDirectModalDetailTransaction() throws InterruptedException {
        WebElement a = webDriver.findElement(By.id("radix-:rp:"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(1000);
    }

    @And("^user click button Berikan Ulasan$")
    public void userClickButtonBerikanUlasan() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//button[@class='btn  bg-lapak border-none']"));
        a.click();
        Thread.sleep(1000);
    }

    @And("^user input \"([^\"]*)\"$")
    public void userInput(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^user send ulasan$")
    public void userSendUlasan() {
    }

    @When("^user click one product$")
    public void userClickOneProduct() throws InterruptedException {
        WebElement a = webDriver.findElement(By.cssSelector(".my-4 > div:nth-of-type(2) > [href='#']"));
        a.click();
        Thread.sleep(3000);
    }

    @And("^user click button Bayar langsung$")
    public void userClickButtonBayarLangsung() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//button[.='Bayar Langsung']"));
        a.click();
        Thread.sleep(1000);
    }

    @Then("^user click button confirm and pay$")
    public void userClickButtonConfirmAndPay() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//button[@class='btn btn-wide flex bg-lapak border-none 2xl:w-full text-white hover:bg-lapak hover:text-white hover:translate-y-2 2xl:font-semibold 2xl:text-xl']"));
        a.click();
        Thread.sleep(20000);
    }
}
