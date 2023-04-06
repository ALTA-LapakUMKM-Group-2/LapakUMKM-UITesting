package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.PageObject.SignIn.CartPage;
import org.example.PageObject.SignIn.ConfirmAndPayPage;
import org.junit.Assert;

import static step_definitions.Hooks.webDriver;

public class CartStepDef {
    @Then("^Click cart on product$")
    public void clickCartOnProduct() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.AddCart();
        Thread.sleep(10000);
    }

    @Then("^Click add to cart$")
    public void clickAddToCart() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.AddToCart();
        Thread.sleep(3000);
        cartPage.ClickOkSuccesAddCart();
        Thread.sleep(10000);
    }

    @And("^Already on Cart Page$")
    public void alreadyOnCartPage() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        Assert.assertTrue(cartPage.VerifyCartPage());
        Thread.sleep(3000);
    }

    @Then("^Click checkbox$")
    public void clickCheckbox() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.ClickOneCheckBox();
        Thread.sleep(3000);
    }

    @And("^Total Must be (\\d+)$")
    public void totalMustBe(int totalAmount) throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        int getTotalAmount = cartPage.VerifyTotalAmount();
        Assert.assertEquals(totalAmount, getTotalAmount);
        Thread.sleep(3000);
    }

    @Then("^Click Cart$")
    public void clickCart() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.CartButton();
        Thread.sleep(10000);
    }

    @Then("^Click Decrease Cart$")
    public void clickDecreaseCart() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.DecreaseItem();
    }

    @Then("^Click Increase Cart$")
    public void clickIncreaseCart() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.increaseItem();
    }

    @Then("^Click Delete Cart$")
    public void clickDeleteCart() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.DeleteCart();
        Thread.sleep(5000);
        cartPage.ConfirmDelete();
        Thread.sleep(20000);
    }
    @Then("^click button beli$")
    public void clickButtonBeli() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.Buttonbeli();
        Thread.sleep(10000);

    }
    @And("^Already on Payment Page$")
    public void alreadyOnPaymentPage() throws InterruptedException {
        ConfirmAndPayPage confirmAndPayPage = new ConfirmAndPayPage(webDriver);
        Assert.assertTrue(confirmAndPayPage.VerifyConfirmAndPayPage());
        Thread.sleep(3000);
    }
    @Then("^click button confirm and pay$")
    public void clickButtonPay() {
        ConfirmAndPayPage confirmAndPayPage = new ConfirmAndPayPage(webDriver);
        confirmAndPayPage.ButtonPay();
    }
    @Then("^Click button home$")
    public void clickButtonHome() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.HomeButton();
        Thread.sleep(15000);
    }
    @Then("^Click cart on product 2$")
    public void clickCartOnProduct2() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.AddCart2();
        Thread.sleep(10000);
    }
    @Then("^Click add to cart 2$")
    public void clickAddToCart2() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.AddToCart();
        Thread.sleep(3000);
        cartPage.ClickOkSuccesAddCart();
        Thread.sleep(10000);
    }





}
