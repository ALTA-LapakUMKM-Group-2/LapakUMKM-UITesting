package org.example.PageObject.ListClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContohClass {

    public static WebDriver webDriver;


    public ContohClass(WebDriver webdriver) {
        PageFactory.initElements(webdriver, this);
        this.webDriver = webDriver;
    }
    @FindBy (xpath ="//input[@id='first-name']" )
    WebElement frstName;

    @FindBy (xpath ="//input[@id='last-name']" )
    WebElement lstName;
    @FindBy (xpath ="//input[@id='postal-code']" )
    WebElement pstlName;
    @FindBy (xpath ="//input[@id='continue']" )
    WebElement btnContinue;
    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    private WebElement itmTotal;
    @FindBy(xpath = "//div[@class='summary_total_label']")
    private WebElement totalPurchase;
    @FindBy(xpath = "//div[@class='summary_tax_label']")
    private WebElement tax;
    @FindBy(xpath = "//button[@id='finish']")
    private WebElement fBtn;
    @FindBy(xpath = "//h2[@class='complete-header']")
    private  WebElement succesOrder;

    public void setFrstName(String firstName) { frstName.sendKeys(firstName);}
    public void setLstNameName(String lastName) { lstName.sendKeys(lastName);}
    public void setPstlName(String postalCode) { pstlName.sendKeys(postalCode);}
    public void setBtnContinue() { btnContinue.click();}



    public Float setItemTotal(){
        String str = itmTotal.getText();
        String[] parts = str.split("\\$");
        float f = Float.parseFloat(parts[1].trim());
        return  f;
    }

    public float setTotalPurchase(){
        String str = totalPurchase.getText();
        String[] parts = str.split("\\$");
        float f = Float.parseFloat(parts[1].trim());
        return  f;
        }

    public Float setTax(){
        String str = tax.getText();
        String[] parts = str.split("\\$");
        float f = Float.parseFloat(parts[1].trim());
        return f ;
    }
    public void finishButton(){
        fBtn.click();
    }

    public String verifyThankOrderSucces(){
        return succesOrder.getText();
    }
}
