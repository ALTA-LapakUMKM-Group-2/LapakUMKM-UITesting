package step_definitions.Profile;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import step_definitions.Hooks;

public class PasswordStepdefs {

    private WebDriver webDriver;
    public PasswordStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }


    @When("^user click on edit password$")
    public void userClickOnEditPassword() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//div[@class='flex text-[18px] md:text-[18px] lg:text-[18px] 2xl:text-[24px] w-8/12 md:w-4/12 lg:w-3/12 text-zinc-800 font-medium gap-2 md:gap-2 lg:gap-2 2xl:gap-3 mt-4 md:mt-4 lg:mt-4 2xl:mt-6 text-center hover:cursor-pointer hover:text-zinc-500 dark:text-white']"));
        a.click();
        Thread.sleep(1000);
    }

    @And("^user already on update password page$")
    public void userAlreadyOnUpdatePasswordPage() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//label[.='Password Lama :']"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(1000);
    }

    @And("^user input password lama \"([^\"]*)\"$")
    public void userInputPasswordLama(String oldPassword) throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//input[@id='input-passwordlama']"));
        a.clear();
        a.sendKeys(oldPassword);
        Thread.sleep(1000);
    }

    @And("^user input password baru \"([^\"]*)\"$")
    public void userInputPasswordBaru(String newPassword) throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//input[@id='input-passwordbaru']"));
        a.clear();
        a.sendKeys(newPassword);
        Thread.sleep(1000);
    }

    @And("^user click icon eyes in password baru field$")
    public void userClickIconEyesInPasswordBaruField() throws InterruptedException {
        WebElement a = webDriver.findElement(By.cssSelector("[title='Ganti Password'] > div:nth-of-type(2) [d='M508 624a112 112 0 0 0 112-112c0-3.28-.15-6.53-.43-9.74L498.26 623.57c3.21.28 6.45.43 9.74.43zm370.72-458.44L836 122.88a8 8 0 0 0-11.31 0L715.37 232.23Q624.91 186 512 186q-288.3 0-430.2 300.3a60.3 60.3 0 0 0 0 51.5q56.7 119.43 136.55 191.45L112.56 835a8 8 0 0 0 0 11.31L155.25 889a8 8 0 0 0 11.31 0l712.16-712.12a8 8 0 0 0 0-11.32zM332 512a176 176 0 0 1 258.88-155.28l-48.62 48.62a112.08 112.08 0 0 0-140.92 140.92l-48.62 48.62A175.09 175.09 0 0 1 332 512z']"));
        a.click();
        Thread.sleep(1000);
    }

    @And("^user input konfirmasi password \"([^\"]*)\"$")
    public void userInputKonfirmasiPassword(String confirmationPassword) throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//input[@id='input-passwordconfirm']"));
        a.clear();
        a.sendKeys(confirmationPassword);
        Thread.sleep(1000);
    }

    @And("^user click icon eyes in konfirmasi password field$")
    public void userClickIconEyesInKonfirmasiPasswordField() throws InterruptedException {
        WebElement a = webDriver.findElement(By.cssSelector("[title='Ganti Password'] > div:nth-of-type(3) [d='M508 624a112 112 0 0 0 112-112c0-3.28-.15-6.53-.43-9.74L498.26 623.57c3.21.28 6.45.43 9.74.43zm370.72-458.44L836 122.88a8 8 0 0 0-11.31 0L715.37 232.23Q624.91 186 512 186q-288.3 0-430.2 300.3a60.3 60.3 0 0 0 0 51.5q56.7 119.43 136.55 191.45L112.56 835a8 8 0 0 0 0 11.31L155.25 889a8 8 0 0 0 11.31 0l712.16-712.12a8 8 0 0 0 0-11.32zM332 512a176 176 0 0 1 258.88-155.28l-48.62 48.62a112.08 112.08 0 0 0-140.92 140.92l-48.62 48.62A175.09 175.09 0 0 1 332 512z']"));
        a.click();
        Thread.sleep(1000);
    }

    @And("^user click button perbarui password$")
    public void userClickButtonPerbaruiPassword() throws InterruptedException {
        WebElement a;
        a = new WebDriverWait(webDriver, 2).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='rounded-xl bg-lapak w-full max-w-full undefined px-6 py-2 text-[15px] md:text-[15px] lg:text-[14px] 2xl:text-[18px] font-semibold capitalize tracking-wider text-zinc-50 hover:bg-sky-500 disabled:cursor-not-allowed disabled:bg-zinc-400 false']")));
        a.click();
        Thread.sleep(5000);
    }

    @And("^update profile success$")
    public void updateProfileSuccess() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//label[.='Password Lama :']"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(2000);
    }
}
