package org.example.PageObject.SignIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    public static WebDriver driver;

    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = ".my-4 > div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(2) svg:nth-of-type(1)")
    private WebElement addCart;
    public void AddCart(){
        addCart.click();
    }

    @FindBy(xpath = "//button[.='Tambah Keranjang']")
    private WebElement addToCart;
    public void AddToCart(){
        addToCart.click();
    }

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement clickOkSuccesAddCart;
    public void ClickOkSuccesAddCart(){
        clickOkSuccesAddCart.click();
    }

    @FindBy(xpath = "//h5[@class='mb-2 text-2xl font-bold tracking-tight text-gray-900 dark:text-white']")
    private WebElement verifyCartPage;
    public boolean VerifyCartPage(){
        return verifyCartPage.isDisplayed();
    }
}
