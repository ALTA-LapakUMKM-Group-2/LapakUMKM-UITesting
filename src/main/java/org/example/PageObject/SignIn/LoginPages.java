package org.example.PageObject.SignIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {
    public static WebDriver driver;
    public LoginPages(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = ".login")
    private WebElement loginPages;
    public boolean verifyLoginPage(){
        loginPages.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//form[@class='mt-6 w-full border-b-4 pb-4']/div[@class='mb-5']/input[@class='input input-bordered input-accent w-full max-w-lg pr-10']")
    private WebElement emailSignIn;
    public void setEmailSignIn(String email){
        emailSignIn.sendKeys(email);
    }


    @FindBy(xpath = "//div[@class='relative']/input[@class='input input-bordered input-accent w-full max-w-lg pr-10']")
    private WebElement passwordSignIn;
    public void setPasswordSignIn (String pswd){
        passwordSignIn.sendKeys(pswd);
    }

    @FindBy(xpath = "//button[@class='rounded-xl bg-lapak w-full max-w-full undefined px-6 py-2 text-[15px] md:text-[15px] lg:text-[14px] 2xl:text-[18px] font-semibold capitalize tracking-wider text-zinc-50 hover:bg-sky-500 disabled:cursor-not-allowed disabled:bg-zinc-400 false']")
    private WebElement btnLogin;
    public void setBtnLogin(){
        btnLogin.click();
    }

    @FindBy(xpath = "//div[@class='flex flex-col w-11/12 mx-auto items-center']")
    private WebElement dashboardPages;
    public boolean verifyDashboardPages(){
        dashboardPages.isDisplayed();
        return true;
    }


}