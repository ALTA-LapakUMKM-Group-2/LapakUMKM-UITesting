package org.example.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.soap.SAAJResult;

public class RegisterPage {
    public static WebDriver driver;
    public RegisterPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy (xpath = "//div[@class='lg:my-12 2xl:my-8 p-4 md:p-6 lg:p-5 2xl:p-10 m-auto bg-white rounded-md  ring-2 ring-lapak w-9/12 md:w-5/12 lg:w-3/12 2xl:max-w-xl mx-auto']")
    private WebElement registerPage;
    public boolean verifyRegisterPage(){
        registerPage.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//form[@class='mt-6 w-full']/div[1]/input[@class='input input-bordered input-accent w-full max-w-lg pr-10']")
    private WebElement fullNameRegis;
    public void setFullNameRegis(String name){
        fullNameRegis.sendKeys(name);
    }

    @FindBy(xpath = "//form[@class='mt-6 w-full']/div[2]/input[@class='input input-bordered input-accent w-full max-w-lg pr-10']")
    private WebElement emailRegis;
    public void setEmailRegis(String mail){
        emailRegis.sendKeys(mail);
    }

    @FindBy(xpath = "//input[@class='input input-bordered input-accent w-full max-w-lg pr-10 mb-2']")
    private WebElement passwordRegis;
    public void setPasswordRegis (String pwd){
        passwordRegis.sendKeys(pwd);
    }

    @FindBy(xpath = "//button[@id='btn-submit']")
    private WebElement btnRegister;
    public void setBtnRegister(){
        btnRegister.click();
    }

}
