package org.example.PageObject.ProductPenjual;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPenjual {
    public static WebDriver driver;

    public ProductPenjual(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    @FindBy(xpath = "//div[@class='w-14 rounded-full']")
    private WebElement clickProfile;

    public void setClickProfile() {
        clickProfile.click();
    }

    @FindBy(xpath = "//a[@id='link-profile']")
    private WebElement clickDataDiri;

    public void setClickDataDiri() {
        clickDataDiri.click();
    }

    @FindBy(xpath = "//div[@class='inline-block flex text-[18px] md:text-[18px] lg:text-[18px] 2xl:text-[24px] w-8/12 md:w-4/12 lg:w-3/12 text-zinc-800 font-medium gap-2 md:gap-2 lg:gap-2 2xl:gap-3 mt-4 md:mt-4 lg:mt-4 2xl:mt-6 text-center hover:cursor-pointer hover:text-zinc-500 dark:text-white']")
    private WebElement clickProductPenjual;

    public void setClickProductPenjual() {
        clickProductPenjual.click();
    }

    @FindBy(xpath = "//input[@id='dropzone-file']")
    private WebElement uploadImage;

    public void setUploadImage() {
        String dir = System.getProperty("user.dir");
        String x = dir + "/src/Image/baju.jpg";
        uploadImage.sendKeys(x);
    }

    @FindBy(xpath = "//button[@id='btn-tambah produk']")
    private WebElement btnTambahProduk;

    public void setBtnTambahProduk() {
        btnTambahProduk.click();
    }

    @FindBy(css = "#produkName")
    private WebElement fillProdukName;

    public void setFillProdukName(String produkName) {
        fillProdukName.clear();
        fillProdukName.sendKeys(produkName);
    }

    @FindBy(css = "#produkName")
    private WebElement fillProdukNameInvalid;

    public void setFillProdukNameInvalid() {
        fillProdukNameInvalid.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

    }

    @FindBy(xpath = "//input[@id='ukuran']")
    private WebElement fillUkuran;

    public void setFillUkuran(String ukuran) {
        fillUkuran.clear();
        fillUkuran.sendKeys(ukuran);
    }

    @FindBy(id = "stockRemaining")
    private WebElement fillStok;

    public void setFillStok(String stok) {
        fillStok.clear();
        fillStok.sendKeys(stok);
    }

    @FindBy(css = "#deskripsi")
    private WebElement fillDeskripsi;

    public void setFillDeskripsi(String des) {
        fillDeskripsi.clear();
        fillDeskripsi.sendKeys(des);
    }

    @FindBy(css = "#price")
    private WebElement fillPrice;

    public void setFillPrice(String price) {
        fillPrice.sendKeys(price);
    }

    @FindBy(xpath = "//option[.='Fashion']")
    private WebElement dropDownCategory;

    public void setDropDownCategory() {
        dropDownCategory.click();
    }

    @FindBy(css = "#btn-update")
    private WebElement btnSubmit;

    public void setBtnSubmit() {
        btnSubmit.click();
    }

    @FindBy(xpath = "//div[@class='stat-value text-lapak']")
    private WebElement productPenjualPage;

    public boolean verifyProductPenjualPage() {
        productPenjualPage.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//p[.='Baju Wanita']")
    private WebElement productPenjual;

    public boolean verifyProductPenjual() {
        productPenjualPage.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//p[.='Baju bagus']")
    private WebElement productPenjualPerbarui;

    public boolean setProductPenjualPerbarui() {
        productPenjualPerbarui.isDisplayed();
        return true;
    }

    @FindBy(css = "#deskripsi")
    private WebElement productPenjualTambah;

    public boolean verifyProductPenjualTambah() {
        productPenjualTambah.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//tr[4]//button[@id='btn-perbarui']")
    private WebElement btnPerbarui;

    public void setBtnPerbarui() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", btnPerbarui);
        btnPerbarui.click();
    }

    @FindBy(xpath = "//tr[4]//button[@id='btn-hapus']")
    private WebElement btnHapus;

    public void setBtnHapus() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", btnHapus);
        btnHapus.click();
    }

    @FindBy(xpath = " //button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement btnYakin;

    public void setBtnYakin() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", btnYakin);
        btnYakin.click();
    }

    @FindBy(xpath = "//p[@class='text-[16px] md:text-[24px] font-semibold text-zinc-800 dark:text-white']")
    private WebElement productHapus;

    public boolean setProductHapus() {
        productHapus.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//input[@id='dropzone-file']")
    private WebElement popupUploadPhoto;

    public boolean setPopupUploadPhoto() {
        popupUploadPhoto.isDisplayed();
        return true;
    }

    @FindBy(css = ".tooltip-top .font-semibold")
    private WebElement popupUploadPhotoS;

    public boolean setPopupUploadPhotoS() {
        popupUploadPhotoS.isDisplayed();
        return true;
    }
    @FindBy(xpath = "//th[.='2']//preceding::img[@alt='produk.jpg']")
    private WebElement btnPhoto;

    public void setBtnPhoto() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", btnPhoto);
        btnPhoto.click();
    }
    @FindBy(xpath = "//input[@id='dropzone-file']")
    private WebElement getUploadPhoto;
    public void setBtnUploadPhoto() {
        String dir = System.getProperty("user.dir");
        String x = dir + "/src/Image/baju.jpg";
       getUploadPhoto.sendKeys(x);
    }
}