package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DrivePage_Anna {
    public DrivePage_Anna() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Drive']")
    public WebElement driveButtonMainMenu;

    @FindBy(xpath = "(//a[@class='main-buttons-item-link'])/span[2]")
    public WebElement myDriveButton;

    @FindBy(xpath = "//a[@class='main-buttons-item-link']//span[.='All Documents']")
    public WebElement allDocumentsButton;

    @FindBy(xpath = "//a[@class='main-buttons-item-link']//span[.='Company Drive']")
    public WebElement companyDriveButton;

    @FindBy(xpath = "//a[@class='main-buttons-item-link']//span[.='Sales and Marketing']")
    public WebElement salesAndMarketing;

    @FindBy(xpath = "(//a[@class='main-buttons-item-link']//span[@class='main-buttons-item-text-title'])[5]")
    public WebElement topManagementDocButton;

    @FindBy(xpath = "(//a[@class='main-buttons-item-link']//span[@class='main-buttons-item-text-title'])[6]")
    public WebElement driveCleanupButton;


    public  WebElement allDriveModules(String options) {
        String locator = "//span[@class='main-buttons-item-text-title']";
        return Driver.getDriver().findElement(By.xpath(locator));
    }
}

