package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.PageObject.SignIn.CartPage;
import org.junit.Assert;

import static step_definitions.Hooks.webDriver;

public class CartStepDef {
    @Then("^Click cart on product$")
    public void clickCartOnProduct() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.AddCart();
    }

    @Then("^Click add to cart$")
    public void clickAddToCart() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.AddToCart();
        Thread.sleep(3000);
        cartPage.ClickOkSuccesAddCart();
    }

    @And("^Already on Cart Page$")
    public void alreadyOnCartPage() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        Assert.assertTrue(cartPage.VerifyCartPage());
        Thread.sleep(3000);
    }
}
