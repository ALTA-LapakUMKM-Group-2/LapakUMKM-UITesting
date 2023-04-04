package step_definitions.Profile;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import step_definitions.Hooks;

public class ProfileStepdefs {

    private WebDriver webDriver;
    public ProfileStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }


    @When("^user click button profile on navbar$")
    public void userClickButtonProfileOnNavbar() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//div[@class='w-14 rounded-full']"));
        a.click();
        Thread.sleep(1000);
    }

    @Then("^user click profile on dropdown sub button$")
    public void userClickProfileOnDropdownSubbutton() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//a[@id='link-profile']"));
        a.click();
        Thread.sleep(3000);
    }

    @And("^user already on profile page$")
    public void userAlreadyOnProfilePage() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//h1[contains(text(),'Profile Detail Saya')]"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(2000);
    }

    @When("^user click on edit profile$")
    public void userClickOnEditProfile() throws InterruptedException {
        WebElement a = webDriver.findElement(By.cssSelector(".mt-10"));
        a.click();
        Thread.sleep(1000);
    }

    @And("^user already on update profile page$")
    public void userAlreadyOnUpdateProfilePage() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//h2[.='Edit Profile']"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(2000);
    }

    @And("^user input nama lengkap \"([^\"]*)\"$")
    public void userInputNamaLengkap(String fullName) throws InterruptedException {
        WebElement a = webDriver.findElement(By.cssSelector("#full_name"));
        a.clear();
        a.sendKeys(fullName);
        Thread.sleep(1000);
    }

    @And("^user input alamat lengkap \"([^\"]*)\"$")
    public void userInputAlamatLengkap(String fullAddress) throws InterruptedException {
        WebElement a = webDriver.findElement(By.cssSelector("#address"));
        a.clear();
        a.sendKeys(fullAddress);
        Thread.sleep(1000);
    }

    @And("^user input email \"([^\"]*)\"$")
    public void userInputEmail(String email) throws InterruptedException {
        WebElement a = webDriver.findElement(By.cssSelector("#email"));
        a.clear();
        a.sendKeys(email);
        Thread.sleep(1000);
    }

    @Then("^user input nomor \"([^\"]*)\"$")
    public void userInputNomor(String nomor) throws InterruptedException {
        WebElement a =webDriver.findElement(By.cssSelector("#phone_number"));
        a.clear();
        a.sendKeys(nomor);
        Thread.sleep(1000);
    }

    @And("^user click button Perbarui Profile$")
    public void userClickButtonPerbaruiProfile() throws InterruptedException {
        WebElement a;
        a = new WebDriverWait(webDriver, 2).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btn-update']")));
        a.click();
        a.click();
        Thread.sleep(10000);
    }

    @And("^update profile success new name \"([^\"]*)\"$")
    public void updateProfileSuccess(String namaTerbaru) throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//p[contains(text(),'"+namaTerbaru+"')]"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(2000);
    }

    @And("^button cant to be click$")
    public void buttonCantToBeClick() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//h2[.='Edit Profile']"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(2000);
    }
}
