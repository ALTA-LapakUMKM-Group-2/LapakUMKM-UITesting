package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//div[@class='login relative flex flex-col justify-center min-h-screen overflow-hidden']")
    private WebElement loginPage;
    public boolean verifyloginPage(){
        loginPage.isDisplayed();
        return true;
    }

    @FindBy (xpath = "//a[.='Daftar']")
    private WebElement btnRegis;
    public void setBtnRegis(){
        btnRegis.click();
    }
}