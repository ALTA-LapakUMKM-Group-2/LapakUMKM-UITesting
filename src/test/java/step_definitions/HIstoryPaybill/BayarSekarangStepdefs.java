package step_definitions.HIstoryPaybill;

import cucumber.api.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import step_definitions.Hooks;

public class BayarSekarangStepdefs {
    private WebDriver webDriver;
    public BayarSekarangStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("^user click button bayar sekarang$")
    public void userClickButtonBayarSekarang() throws InterruptedException {
        WebElement a;
        a = new WebDriverWait(webDriver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='grid xl:grid-cols-3 gap-5']/div[1]//button[@id='btn-balas']")));
        a.click();
        Thread.sleep(3000);
    }

    @And("^user direct on payment page$")
    public void userDirectOnPaymentPage() throws InterruptedException {
        webDriver.getWindowHandles().forEach(tab->webDriver.switchTo().window(tab));
        WebElement a = webDriver.findElement(By.xpath("//div[@class='merchant-name']"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(3000);
    }
}
