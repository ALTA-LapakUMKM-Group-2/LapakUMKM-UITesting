package step_definitions.HomeHome;

import cucumber.api.java.en.And;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.jodah.failsafe.internal.util.Assert;
import org.example.PageObject.Home.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;

public class Home {
    private WebDriver webDriver;
    public Home(){
        super();
        this.webDriver= Hooks.webDriver;
    }

    @And("^user click icon search$")
    public void userClickIconSearch() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//form[@class='relative mx-auto w-full']"));
        a.click();
        Thread.sleep(10000);
    }
    @And("^user input \"([^\"]*)\" from input text$")
    public void userInputFromInputText(String arg) throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//input[@class='peer cursor-pointer relative z-10 h-12 w-12 rounded-xl 2xl:dark:border-4 border border-black bg-transparent pl-12 outline-none  focus:cursor-text focus:w-full focus:border-black focus:pl-16 focus:pr-4 text-black dark:text-white dark:focus:border-white dark:border-white transition-all']"));
        a.sendKeys(arg);
        Thread.sleep(6000);

    }

    @And("^user click button dark mode$")
    public void userClickButtonDarkMode() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//label[@class='swap swap-rotate  mx-auto']"));
        a.click();
        Thread.sleep(2000);
    }


    @And("^user click Cart Button$")
    public void userClickCartButton() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/*[1]"));
        a.click();
        Thread.sleep(2000);
    }

    @When("^user click button Profilee field$")
    public void userClickButtonProfileeField() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//div[@class='w-14 rounded-full']"));
        a.click();
        Thread.sleep(10000);
    }

    @Then("^button Profilee can be click$")
    public void buttonProfileeCanBeClick() throws InterruptedException {
        HomePage homePage = new HomePage(webDriver);
        homePage.setLinkProfile();
        Thread.sleep(2000);
    }

    @When("^user click button Sedang Tren field$")
    public void userClickButtonSedangTrenField()throws InterruptedException  {
        WebElement a = webDriver.findElement(By.xpath("//button[.='Sedang Tren']"));
        a.click();
        Thread.sleep(10000);
    }

    @Then("^button Sedang Tren can be click$")
    public void buttonSedangTrenCanBeClick()throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//button[.='Sedang Tren']"));
        a.click();
        Thread.sleep(2000);
    }

    @Then("^button Fashion Page can be click$")
    public void buttonFashioPageCanBeClick()throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//button[.='Fashion']"));
        a.click();
        Thread.sleep(2000);
    }

    @Then("^button Game & Hobi can be click$")
    public void buttonGameHobiCanBeClick() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//button[.='Game & hobi']"));
        a.click();
        Thread.sleep(2000);
    }

    @When("^user click button Sepatu & Sandal field$")
    public void userClickButtonSepatuSandalField() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//button[.='Sepatu dan Sendal']"));
        a.click();
        Thread.sleep(2000);
    }

    @Then("^button Sepatu & Sandal can be click$")
    public void buttonSepatuSandalCanBeClick() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//button[.='Sepatu dan Sendal']"));
        a.click();
        Thread.sleep(2000);
    }

    @When("^user click button Alat Rumah Tangga field$")
    public void userClickButtonAlatRumahTanggaField() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath(" //button[.='Alat Rumah Tangga']"));
        a.click();
        Thread.sleep(2000);
    }


    @Then("^button Alat Rumah Tangga can be click$")
    public void buttonAlatRumahTanggaCanBeClick() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath(" //button[.='Alat Rumah Tangga']"));
        a.click();
        Thread.sleep(2000);
    }
}
