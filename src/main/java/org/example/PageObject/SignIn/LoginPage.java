package org.example.PageObject.SignIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver webDriver;


    public LoginPage(WebDriver webdriver) {
        PageFactory.initElements(webdriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(id = "user-name")
    private WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//h3")
    private WebElement errorMessage;


    @FindBy(id = "login-button")
    private WebElement loginButton;

    public void setUsername(String user) {
        userName.sendKeys(user);
    }

    public void setPassword(String pwd) {
        password.sendKeys(pwd);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }
    public boolean verifiyLoginPage(){
        userName.isDisplayed();
        return true;
    }
}


