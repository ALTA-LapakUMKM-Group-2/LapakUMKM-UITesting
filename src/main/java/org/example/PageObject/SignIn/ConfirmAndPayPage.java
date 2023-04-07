package org.example.PageObject.SignIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmAndPayPage {

    public static WebDriver driver;

    public ConfirmAndPayPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[.='Total Semua']")
    private WebElement verifyConfirmAndPayPage;
    public boolean VerifyConfirmAndPayPage(){
        return verifyConfirmAndPayPage.isDisplayed();
    }

    @FindBy(css = ".btn")
    private WebElement buttonPay;
    public void ButtonPay() {
        buttonPay.click();
    }
}
