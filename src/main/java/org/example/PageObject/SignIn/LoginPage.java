package org.example.PageObject.SignIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver driver;
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class='w-14 rounded-full']")
    private WebElement clickProfile1;
    public void setClickProfile1(){
        clickProfile1.click();
    }
    @FindBy(xpath = "//a[.='Masuk']")
    private WebElement clickMasuk;
    public void setClickMasuk(){
        clickMasuk.click();
    }

    @FindBy(xpath = "//div[@class='login relative flex flex-col justify-center min-h-screen overflow-hidden']")
    private WebElement loginPage;
    public boolean verifyLoginPage(){
        loginPage.isDisplayed();
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


    @FindBy(xpath = "//button[@class='font-semibold md:flex text-4xl text-white hover:text-accent']")

    private WebElement dashboardPage;
    public boolean verifyDashboardPage(){
        dashboardPage.isDisplayed();
        return true;
    }


}