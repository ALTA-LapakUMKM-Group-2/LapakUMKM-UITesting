package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.TokoPenjual.TokoPenjual;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TokoPenjualStepdefs {

    private WebDriver webDriver;
    public TokoPenjualStepdefs() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("^user already on page toko penjual$")
    public void userAlreadyOnPageTokoPenjual() throws InterruptedException {
       TokoPenjual tokoPenjual = new TokoPenjual(webDriver);
       tokoPenjual.setBtnProduct();
       Thread.sleep(6000);
       tokoPenjual.setBtnToko();
       Thread.sleep(8000);

    }

    @When("^user chose product and clik title product$")
    public void userChoseProductAndClikTitleProduct() throws InterruptedException {
        TokoPenjual tokoPenjual = new TokoPenjual(webDriver);
        tokoPenjual.setBtnProductToko();
        Thread.sleep(3000);
    }

    @Then("^user direct to see detail product$")
    public void userDirectToSeeDetailProduct() throws InterruptedException {
        TokoPenjual tokoPenjual = new TokoPenjual(webDriver);
        Assert.assertTrue(tokoPenjual.setDetail());
        Thread.sleep(1000);

    }

    @And("^user click button tambah keranjang$")
    public void userClickButtonTambahKeranjang() throws InterruptedException {
        TokoPenjual tokoPenjual = new TokoPenjual(webDriver);
        tokoPenjual.setBtnProductTokoKeranjang();
        Thread.sleep(4000);
    }

    @And("^user succesfuly add product to keranjang$")
    public void userSuccesfulyAddProductToKeranjang() throws InterruptedException {
        TokoPenjual tokoPenjual = new TokoPenjual(webDriver);
        Assert.assertTrue(tokoPenjual.setKeranjang());
        Thread.sleep(1000);
    }

    @And("^user click button bayar langsung$")
    public void userClickButtonBayarLangsung() {
        TokoPenjual tokoPenjual = new TokoPenjual(webDriver);
        tokoPenjual.setBtnProductTokoBayarLangsung();
    }

    @And("^user succesfuly direct to payment$")
    public void userSuccesfulyDirectToPayment() throws InterruptedException {
        TokoPenjual tokoPenjual = new TokoPenjual(webDriver);
        Assert.assertTrue(tokoPenjual.setSubtotalBayarLangsung());
        Thread.sleep(1000);

    }

    @When("^user click button chat penjual$")
    public void userClickButtonChatPenjual() {
        TokoPenjual tokoPenjual = new TokoPenjual(webDriver);
        tokoPenjual.setBtnProductChat();
    }

    @And("^user click field chat and fill text$")
    public void userClickFieldChatAndFillText() {
        TokoPenjual tokoPenjual = new TokoPenjual(webDriver);
        tokoPenjual.setBtnField();
        tokoPenjual.setGetFieldChat("halo gan");
    }

    @And("^user click send chat$")
    public void userClickSendChat() throws InterruptedException {
        TokoPenjual tokoPenjual = new TokoPenjual(webDriver);
        tokoPenjual.setBtnSendChat();
        Thread.sleep(10000);
    }

    @Then("^user succesfuly chat penjual$")
    public void userSuccesfulyChatPenjual() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//div[.='halo gan']"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(1000);
    }

}
