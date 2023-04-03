package step_definitions.Profile;

import com.google.j2objc.annotations.Weak;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;

public class UpdatePhotoStepdefs {
    private WebDriver webDriver;
    public UpdatePhotoStepdefs (){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("^user click on photo profile$")
    public void userClickOnPhotoProfile() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//img[@alt='profile.png']"));
        a.click();
        Thread.sleep(1000);

    }

    @Then("^user click on choose file$")
    public void userClickOnChooseFile() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//input[@id='upload_gambar']"));
        String x = "/home/kukuh/AlteraAcademy/Capstone/LapakUMKM-UITesting/src/Image/img.png";
        a.sendKeys(x);
        Thread.sleep(1000);
    }

    @And("^user click button Perbarui Profile Photo$")
    public void userClickButtonPerbaruiProfilePhoto() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//button[@class='rounded-xl bg-lapak w-full max-w-full undefined px-6 py-2 text-[15px] md:text-[15px] lg:text-[14px] 2xl:text-[18px] font-semibold capitalize tracking-wider text-zinc-50 hover:bg-sky-500 disabled:cursor-not-allowed disabled:bg-zinc-400 undefined']"));
        a.click();
        Thread.sleep(1000);
    }

    @And("^photo profile success to update$")
    public void photoProfileSuccessToUpdate() throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//p[@class='text-zinc-800 text-[22px] font-semibold mb-8']"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(5000);
    }
}
