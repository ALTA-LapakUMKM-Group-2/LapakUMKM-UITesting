package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.PageObject.SignIn.CartPage;
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
}
