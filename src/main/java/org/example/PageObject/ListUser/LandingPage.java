package org.example.PageObject.ListUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LandingPage {
    public static WebDriver webDriver;


    public LandingPage(WebDriver webdriver){
        PageFactory.initElements(webdriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    private WebElement vrifySuccesLogin;
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement shoppingChartClick;
    @FindBy(xpath ="//select[@class='product_sort_container']" )
    private WebElement product;

    public boolean verifiyLogin(){
        vrifySuccesLogin.isDisplayed();
        return true;
    }
    public void clickShopcart(){shoppingChartClick.click();}
    public void sortProduct (String sortProduct) {
        Select a = new Select(product);
        a.selectByVisibleText(sortProduct);
    }


}
