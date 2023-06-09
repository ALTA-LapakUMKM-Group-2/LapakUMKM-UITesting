package org.example.PageObject.SignIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  CartPage {

    public static WebDriver driver;

    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class='my-4 gap-y-5 gap-x-5 grid xl:grid-cols-5 lg:grid-cols-4 md:grid-cols-3 sm:grid-cols-2 mx-auto mt-10']/div[3]//button[@class='btn btn-sm bg-lapak border-none hover:bg-sky-500 focus:ring-4 focus:outline-none focus:ring-blue-300']")
    private WebElement addCart;
    public void AddCart(){
        addCart.click();
    }

    @FindBy(xpath = "//button[.='Tambah Keranjang']")
    private WebElement addToCart;
    public void AddToCart(){
        addToCart.click();
    }

    @FindBy(css = ".swal2-confirm")
    private WebElement clickOkSuccesAddCart;
    public void ClickOkSuccesAddCart(){
        clickOkSuccesAddCart.click();
    }

    @FindBy(xpath = "//h5[@class='mb-2 text-2xl font-bold tracking-tight text-gray-900 dark:text-white']")
    private WebElement verifyCartPage;
    public boolean VerifyCartPage(){
        return verifyCartPage.isDisplayed();
    }

    @FindBy(css = "thead #checkcart")
    private WebElement clickOneCheckBox;
    public void ClickOneCheckBox() {
        clickOneCheckBox.click();
    }

    @FindBy(css = "p:nth-of-type(3)")
    private WebElement verifyTotalAmount;
    public int VerifyTotalAmount() {
        String getAmount = verifyTotalAmount.getText();
        String trimString = getAmount.substring(12);
        String replacePoint = trimString.replace(".","");
        int convertStringToInteger = Integer.parseInt(replacePoint);
        return convertStringToInteger;
    }

    @FindBy(css = ".w-8")
    private WebElement cartButton;
    public void CartButton() {
        cartButton.click();
    }

    @FindBy(css = ".ml-2")
    private WebElement decreaseItem;
    public void DecreaseItem() {
        decreaseItem.click();
    }

    @FindBy(css = ".mr-2")
    private WebElement increaseItem;
    public void increaseItem() {
        increaseItem.click();
    }

    @FindBy(css = ".btn-outline")
    private WebElement deleteCart;
    public void DeleteCart() {
        deleteCart.click();
    }

    @FindBy(css = ".swal2-confirm")
    private WebElement confirmDelete;
    public void ConfirmDelete() {
        confirmDelete.click();
    }

    @FindBy(id = "submit")
    private WebElement buttonBeli;
    public void Buttonbeli() {
        buttonBeli.click();
    }
    @FindBy(css = "[alt='Lapak_umkm']")
    private WebElement homeButton;
    public void HomeButton() {
        homeButton.click();
    }
    @FindBy(xpath = "//div[22]//button[@class='btn btn-sm bg-lapak border-none hover:bg-sky-500 focus:ring-4 focus:outline-none focus:ring-blue-300']")
    private WebElement addCart2;
    public void AddCart2(){
        addCart2.click();
    }



}
