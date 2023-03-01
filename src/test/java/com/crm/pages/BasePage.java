package com.crm.pages;




import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public abstract class BasePage {

    public void navigateToModuleAndClick(String moduleName) {
        String locator = "//ul[@class='menu-items']//span[contains(.,'"+moduleName+"')]";
        WebElement module = Driver.getDriver().findElement(By.xpath(locator));
        module.click();
    }



}
