package step_definitions.ListLog;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

import static org.junit.Assert.assertEquals;

public class CheckoutSteps {
    private WebDriver webDriver;

    public CheckoutSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User input information checkout and continue")
    public void removeItemUser() throws InterruptedException {
        ContohClass cekoutPage = new ContohClass(webDriver);
        cekoutPage.setFrstName("Farhan");
        cekoutPage.setLstNameName("Darmawan");
        cekoutPage.setPstlName("40123");
        cekoutPage.setBtnContinue();
        Thread.sleep(3000);
    }

    @And("User verify total price order")
    public void verifyTotalPrice() throws InterruptedException{
        ContohClass cekoutPage = new ContohClass(webDriver);
        Assert.assertEquals(cekoutPage.setItemTotal()+ cekoutPage.setTax(),cekoutPage.setTotalPurchase(),0);
        Thread.sleep(3000);
    }
    @Then("User click finish button")
    public void clickButtonFinish() throws InterruptedException{
        ContohClass cekoutPage = new ContohClass(webDriver);
        cekoutPage.finishButton();

    }
    @And("User succesfully order with text \"(.*)\"")
    public void verifySuccesOrder(String succesText) throws InterruptedException{
        ContohClass cekoutPage = new ContohClass(webDriver);
        assertEquals(succesText, cekoutPage.verifyThankOrderSucces());
        Thread.sleep(1000);
    }

}
