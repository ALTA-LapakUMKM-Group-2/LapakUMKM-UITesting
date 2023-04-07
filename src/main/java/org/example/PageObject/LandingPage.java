package org.example.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    public static WebDriver driver;

    public LandingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//p[@class='dark:text-white font-semibold text-sm md:text-lg lg:text-xl']")
    private WebElement landingPage;
    public boolean verifyLandingPage(){
        landingPage.isDisplayed();
        return true;
    }
    @FindBy (xpath = "//img[@src='/assets/default-47d1328d.jpg']")
    private WebElement btnProfile;
    public void setBtnProfile(){
        btnProfile.click();
    }

    @FindBy (xpath = "//a[.='Masuk']")
    private WebElement btnEnter;
    public void setBtnEnter(){
        btnEnter.click();
    }

    @FindBy(xpath = "//div[@class='h-full w-full overflow-auto bg-gray-100 dark:bg-slate-800']")
    private WebElement dsbPage;
    public boolean verifyDsbpage(){
        dsbPage.isDisplayed();
        return true;
    }
}