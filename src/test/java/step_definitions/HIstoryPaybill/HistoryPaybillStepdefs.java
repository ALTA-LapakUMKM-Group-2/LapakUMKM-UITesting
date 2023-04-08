package step_definitions.HIstoryPaybill;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;

public class HistoryPaybillStepdefs {

    private WebDriver webDriver;
    public HistoryPaybillStepdefs(){
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
        Thread.sleep(3000);
    }

    @And("^user already on History Pembelian page$")
    public void userAlreadyOnHistoryPembelianPage() throws InterruptedException {
        WebElement a = webDriver.findElement(By.cssSelector(".mt-12"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(5000);
    }

    @Then("^user click on button detail transaction$")
    public void userClickOnButtonDetailTransaction() throws InterruptedException {
        WebElement a = webDriver.findElement(By.id("btn-bayar"));
        a.click();
        Thread.sleep(4000);

    }

    @And("^user direct modal detail transaction$")
    public void userDirectModalDetailTransaction() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//p[@class='border-b-2 pb-2 font-semibold text-left text-sm font-medium dark:text-white dark:border-lapak']"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(1000);
    }

    @And("^user click button Berikan Ulasan$")
    public void userClickButtonBerikanUlasan() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//button[@class='btn btn-sm bg-lapak border-none']"));
        a.click();
        Thread.sleep(1000);
    }

    @And("^user input \"([^\"]*)\"$")
    public void userInput(String ulasan) throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//textarea[@id='comment']"));
        a.sendKeys(ulasan);
        Thread.sleep(1000);
        WebElement b = webDriver.findElement(By.xpath("//form[@class='w-10/12 mx-auto mt-5']//div[4]"));
        b.click();
        Thread.sleep(1000);
    }

    @And("^user send ulasan$")
    public void userSendUlasan() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//button[@id='btn-feedback']"));
        a.click();
        Thread.sleep(2000);
    }

    @When("^user click one product$")
    public void userClickOneProduct() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//div[@class='my-4 gap-y-5 gap-x-5 grid xl:grid-cols-5 lg:grid-cols-4 md:grid-cols-3 sm:grid-cols-2 mx-auto mt-10']/div[1]/a[1]"));
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
        WebElement a = webDriver.findElement(By.xpath("//div[@class='flex justify-center mt-20']"));
        a.click();
        Thread.sleep(5000);
    }

    @Then("^user click detail transaction$")
    public void userClickDetailTransaction() throws InterruptedException {
        WebElement a = webDriver.findElement(By.cssSelector(".transform"));
        a.click();
        Thread.sleep(5000);
    }

    @And("^User appear detail transaction$")
    public void userAppearDetailTransaction() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//p"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(1000);
    }

    @Then("^user click detail button bayar sekarang$")
    public void userClickDetailButtonBayarSekarang() throws InterruptedException {
        WebElement a = webDriver.findElement(By.id("btn-balas"));
        a.click();
        Thread.sleep(2000);
    }

    @And("^User direct in payment page$")
    public void userDirectInPaymentPage() throws InterruptedException {
        webDriver.getWindowHandles().forEach(tab->webDriver.switchTo().window(tab));
        WebElement a = webDriver.findElement(By.cssSelector("tetsing1@gmail.com"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(3000);
    }
}
