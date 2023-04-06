package org.example.PageObject.SignIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePages {
        public static WebDriver driver;

        public HomePages(WebDriver driver) {
            PageFactory.initElements(driver, this);
            this.driver = driver;

        }

        @FindBy(xpath = "//div[@class='flex gap-4 justify-between w-full md:mx-10']")
        private WebElement homePages;

        public boolean verifyHomePages() {
            homePages.isDisplayed();
            return true;
        }

        @FindBy(css = "[src='/assets/default-47d1328d.jpg']")
        private WebElement btnProf;

        public void setBtnProf() {
            btnProf.click();
        }

        @FindBy(css = "li > a")
        private WebElement btnEntry;

        public void setBtnEntry() {
            btnEntry.click();
        }
    }
