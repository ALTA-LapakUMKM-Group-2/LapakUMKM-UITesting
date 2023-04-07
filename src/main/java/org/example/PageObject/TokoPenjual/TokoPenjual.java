package org.example.PageObject.TokoPenjual;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TokoPenjual {
    public static WebDriver driver;

    public TokoPenjual(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//h5[.='Kaos Oblong']//following::img[1]")
    private WebElement btnProduct;
    public void setBtnProduct() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", btnProduct);
        btnProduct.click();
    }


    @FindBy(xpath = "//div[@class='w-20 rounded-full']/img[@src='https://storage.googleapis.com/images_lapak_umkm/profile/1680460071693596443_5.png']")
    private WebElement btnToko;
    public void setBtnToko() {
        btnToko.click();
    }


    @FindBy(xpath = "//h5[.='Sepatu Asli Cibaduyut']//following::img[1]")
    private WebElement btnProductToko;
    public void setBtnProductToko() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", btnProductToko);
        btnProductToko.click();
    }

    @FindBy(xpath = "//button[.='Bayar Langsung']")
    private WebElement btnProductTokoBayarLangsung;
    public void setBtnProductTokoBayarLangsung() {
        btnProductTokoBayarLangsung.click();
    }

    @FindBy(xpath = "//button[@class='btn btn-ghost bg-lapak rounded-xl items-center justify-center hover:bg-lapak text-white']")
    private WebElement btnProductChat;
    public void setBtnProductChat() {
        btnProductChat.click();
    }
    @FindBy(xpath = "//button[.='Tambah Keranjang']")
    private WebElement btnProductTokoKeranjang;
    public void setBtnProductTokoKeranjang() {
        btnProductTokoKeranjang.click();
    }

    @FindBy(xpath = "//h1[.='Subtotal']")
    private WebElement getSubtotalBayarLangsung;

    public boolean setSubtotalBayarLangsung() {
        getSubtotalBayarLangsung.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement getKeranjang;

    public boolean setKeranjang() {
        getKeranjang.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//button[@class='btn btn-ghost bg-lapak rounded-xl text-white']")
    private WebElement getDetail;

    public boolean setDetail() {
        getDetail.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//div[@class='transition-opacity fixed opacity-100 2xl:bottom-10 lg:bottom-10 bottom-0 2xl:right-10 lg:right-10 right-0 2xl:h-3/6 lg:h-3/6 h-full overflow-auto flex 2xl:flex-row lg:flex-row flex-col items-center justify-center z-50']//input[@class='block input-accent w-full p-4 pl-10 text-sm text-gray-900 border border-gray-300 rounded-lg bg-gray-50']")
    private WebElement getFieldChat;

    public void setGetFieldChat(String chat) {

        getFieldChat.sendKeys(chat);
    }


    @FindBy(css = ".fixed .text-white")
    private WebElement btnSendChat;
    public void setBtnSendChat() {
        btnSendChat.click();
    }


    @FindBy(css = ".fixed [placeholder='Tulis Pesan . . . ']")
    private WebElement btnField;
    public void setBtnField() {
        btnField.click();
    }
}