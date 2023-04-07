package org.example.PageObject.Home;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public static WebDriver driver;
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class='w-14 rounded-full']")
    private WebElement buttonProfil;
    public void setButtonProfil(){
        buttonProfil.click();
    }


    @FindBy(xpath = "//a[@id='link-profile']")
    private WebElement linkProfile;
    public boolean setLinkProfile(){
        linkProfile.isDisplayed();
        return true;
    }
}