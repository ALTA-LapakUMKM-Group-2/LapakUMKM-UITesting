package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.ProductPenjual.ProductPenjual;
import org.example.PageObject.SignIn.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static step_definitions.Hooks.webDriver;

public class ProductPenjualStepdefs {
    private WebDriver webDriver;
    public ProductPenjualStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @Given("^user already login$")
    public void userAlreadyLogin()throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setClickProfile1();
        loginPage.setClickMasuk();
        loginPage.setEmailSignIn("testingqe0@gmail.com");
        loginPage.setPasswordSignIn("@Qwerty1231");
        loginPage.setBtnLogin();
        Thread.sleep(7000);
    }

    @And("^user already on page product penjual$")
    public void userAlreadyOnPageProductPenjual() throws InterruptedException {
        ProductPenjual productPenjual = new ProductPenjual(webDriver);
        productPenjual.setClickProfile();
        Thread.sleep(3000);
        productPenjual.setClickDataDiri();
        Thread.sleep(3000);
        productPenjual.setClickProductPenjual();
        Thread.sleep(10000);
    }


    @When("^user click button tambah produk$")
    public void userClickButtonTambahProduk() throws InterruptedException {
        ProductPenjual productPenjual = new ProductPenjual(webDriver);
        productPenjual.setBtnTambahProduk();
        Thread.sleep(2000);
    }

    @And("^user fill data tambah produk with valid data$")
    public void userFillDataTambahProdukWithValidData() throws InterruptedException {
        ProductPenjual productPenjual = new ProductPenjual(webDriver);
        productPenjual.setUploadImage();
        productPenjual.setFillProdukName("Baju Wanita");
        productPenjual.setFillUkuran("L dan XL");
        productPenjual.setFillStok("19");
        productPenjual.setFillPrice("59000");
        productPenjual.setDropDownCategory();
        productPenjual.setFillDeskripsi("Baju enak dipakai dan adem gaes");
        Thread.sleep(2000);

    }

    @And("^user click submit$")
    public void userClickSubmit() throws InterruptedException {
        ProductPenjual productPenjual = new ProductPenjual(webDriver);
        productPenjual.setBtnSubmit();
        Thread.sleep(10000);
    }

    @Then("^user succesfuly tambah produk with valid data$")
    public void userSuccesfulyTambahProdukWithValidData() throws InterruptedException {
        ProductPenjual productPenjual = new ProductPenjual(webDriver);
        Assert.assertTrue(productPenjual.verifyProductPenjualPage());
        Thread.sleep(3000);
    }

    @And("^user see new produk on produk penjual page$")
    public void userSeeNewProdukOnProdukPenjualPage() throws InterruptedException {
        ProductPenjual productPenjual = new ProductPenjual(webDriver);
        Assert.assertTrue(productPenjual.verifyProductPenjual());
        Thread.sleep(3000);
    }

    @And("^user fill data tambah produk with invalid data$")
    public void userFillDataTambahProdukWithInvalidData() throws InterruptedException {
        ProductPenjual productPenjual = new ProductPenjual(webDriver);
        productPenjual.setFillProdukName("");
        productPenjual.setFillUkuran("L dan XL");
        productPenjual.setFillStok("19");
        productPenjual.setFillPrice("59000");
        productPenjual.setDropDownCategory();
        productPenjual.setFillDeskripsi("Baju enak dipakai dan adem gaes");
        Thread.sleep(2000);
    }


    @Then("^user see error gagal$")
    public void userSeeErrorGagal() throws InterruptedException {
        ProductPenjual productPenjual = new ProductPenjual(webDriver);
        Assert.assertTrue(productPenjual.verifyProductPenjualTambah());
        Thread.sleep(1000);
    }


    @When("^user click button perbarui produk$")
    public void userClickButtonPerbaruiProduk() {
        ProductPenjual productPenjual = new ProductPenjual(webDriver);
        productPenjual.setBtnPerbarui();
    }

    @And("^user fill data pebarui with valid data$")
    public void userFillDataPebaruiWithValidData() throws InterruptedException {
        ProductPenjual productPenjual = new ProductPenjual(webDriver);
        productPenjual.setFillProdukName("Baju bagus");
        productPenjual.setFillUkuran("L");
        productPenjual.setFillStok("19");
        productPenjual.setDropDownCategory();
        productPenjual.setFillDeskripsi("Mantaap");
        Thread.sleep(8000);
    }

    @Then("^user succesfuly perbarui produk with valid data$")
    public void userSuccesfulyPerbaruiProdukWithValidData() throws InterruptedException {
        ProductPenjual productPenjual = new ProductPenjual(webDriver);
        Assert.assertTrue(productPenjual.setProductPenjualPerbarui());
        Thread.sleep(3000);
    }


    @And("^user fill data pebarui with invalid data$")
    public void userFillDataPebaruiWithInvalidData() throws InterruptedException {
        ProductPenjual productPenjual = new ProductPenjual(webDriver);
        productPenjual.setFillProdukNameInvalid();
        productPenjual.setFillUkuran("");
        productPenjual.setFillStok("19");
        productPenjual.setDropDownCategory();
        productPenjual.setFillDeskripsi("Mantaap");
        Thread.sleep(5000);
    }

    @Then("^user see pop up request failed$")
    public void userSeePopUpRequestFailed() throws InterruptedException {
        ProductPenjual productPenjual = new ProductPenjual(webDriver);
        Assert.assertTrue(productPenjual.verifyProductPenjualTambah());
        Thread.sleep(1000);
    }

    @When("^user selects the product and click deleted$")
    public void userSelectsTheProductAndClickDeleted() throws InterruptedException {
        ProductPenjual productPenjual = new ProductPenjual(webDriver);
        productPenjual.setBtnHapus();
        Thread.sleep(2000);
    }

    @Then("^user see pop up konfirmasi click yakin$")
    public void userSeePopUpKonfirmasiClickYakin() throws InterruptedException {
        ProductPenjual productPenjual = new ProductPenjual(webDriver);
        productPenjual.setBtnYakin();
        Thread.sleep(8000);
    }

    @And("^user succesfully delete produk$")
    public void userSuccesfullyDeleteProduk() throws InterruptedException {
        ProductPenjual productPenjual = new ProductPenjual(webDriver);
        Assert.assertTrue(productPenjual.setProductHapus());
        Thread.sleep(3000);
    }

    @When("^user user selects the product and click photo produk$")
    public void userUserSelectsTheProductAndClickPhotoProduk() throws InterruptedException {
        ProductPenjual productPenjual = new ProductPenjual(webDriver);
        productPenjual.setBtnPhoto();
        Thread.sleep(5000);
    }

    @And("^user see pop up add new photo$")
    public void userSeePopUpAddNewPhoto() throws InterruptedException {
        ProductPenjual productPenjual = new ProductPenjual(webDriver);
        Assert.assertTrue(productPenjual.setPopupUploadPhoto());
        Thread.sleep(3000);
    }

    @Then("^user click upload foto and choose photo to upload$")
    public void userClickUploadFotoAndChoosePhotoToUpload() throws InterruptedException {
        ProductPenjual productPenjual = new ProductPenjual(webDriver);
        productPenjual.setBtnUploadPhoto();
        productPenjual.setBtnSubmit();
        Thread.sleep(8000);
    }

    @And("^user succesfully add photo produk$")
    public void userSuccesfullyAddPhotoProduk() throws InterruptedException {
        ProductPenjual productPenjual = new ProductPenjual(webDriver);
        Assert.assertTrue(productPenjual.setPopupUploadPhotoS());
        Thread.sleep(3000);

    }

    @Then("^user click upload foto and choose file other extension to upload$")
    public void userClickUploadFotoAndChooseFileOtherExtensionToUpload() throws InterruptedException {
        ProductPenjual productPenjual = new ProductPenjual(webDriver);
        productPenjual.setBtnUploadPhotoExtension();
        productPenjual.setBtnSubmit();
        Thread.sleep(8000);
    }

    @And("^user see error pop up$")
    public void userSeeErrorPopUp() throws InterruptedException {
        ProductPenjual productPenjual = new ProductPenjual(webDriver);
        Assert.assertTrue(productPenjual.setPopupUploadPhotoError());
        Thread.sleep(1000);
    }

    @Then("^user click upload foto and choose file lrge size to upload$")
    public void userClickUploadFotoAndChooseFileLrgeSizeToUpload() throws InterruptedException {
        ProductPenjual productPenjual = new ProductPenjual(webDriver);
        productPenjual.setBtnUploadPhotoLarge();
        productPenjual.setBtnSubmit();
        Thread.sleep(12000);
    }

    @And("^user chose photo for delete and user click button hapus$")
    public void userChosePhotoForDeleteAndUserClickButtonHapus() throws InterruptedException {
        ProductPenjual productPenjual = new ProductPenjual(webDriver);
        productPenjual.setBtnHapusPhoto();
        Thread.sleep(2000);
        productPenjual.setBtnYakin();
        Thread.sleep(5000);
    }

    @Then("^user succesfully delete photo produk$")
    public void userSuccesfullyDeletePhotoProduk() throws InterruptedException {
        ProductPenjual productPenjual = new ProductPenjual(webDriver);
        Assert.assertTrue(productPenjual.setPopupUploadPhotoS());
        Thread.sleep(3000);
    }
}
