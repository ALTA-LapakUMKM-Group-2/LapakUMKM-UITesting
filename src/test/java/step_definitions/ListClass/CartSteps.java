package step_definitions.ListClass;

import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;

public class CartSteps {
    private WebDriver webDriver;

    public CartSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User remove item \"(.*)\"")
    public void removeItemUser(String nameItem) throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//div[text()='"+nameItem+"']/ancestor::div[@class='cart_item_label']/child::div/button"));
        a.click();
        Thread.sleep(3000);
    }
    @And("User click checkout")
    public void checkoutBtn()throws InterruptedException{
        Contoh cartPage = new Contoh(webDriver);
        cartPage.setCekOutBtn();
        Thread.sleep(3000);
    }

    }

