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



    @FindBy(css = "div[class='loader-mask shown']")
    @CacheLookup
    protected WebElement loaderMask;

    @FindBy(css = "h1[class='oro-subtitle']")
    public WebElement pageSubTitle;

    @FindBy(css = "#user-menu > a")
    public WebElement userName;

    @FindBy(linkText = "Logout")
    public WebElement logOutLink;

    @FindBy(linkText = "My User")
    public WebElement myUser;

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(css = ".user-img.user-default-avatar")
    public WebElement myProfileIcon;


    @FindBy(xpath = "//span[.='My Profile']")
    public WebElement myProfileOption;

    @FindBy(xpath = "//span[.='Edit Profile Settings']")
    public WebElement editProfileSettingsOption;

    @FindBy(xpath = "//span[@class='menu-popup-item menu-popup-no-icon ']//span[.='Themes']")
    public WebElement themesOption;

    @FindBy(xpath = "(//span[.='Configure notifications'])[2]")
    public WebElement configureNotificationsOption;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logoutOption;

    @FindBy (id = "bx-im-bar-notify")
    public WebElement notifications;

    @FindBy (xpath = "//div[@class='help-block-icon']")
    public WebElement helpButton;

    @FindBy (id = "bx-im-bar-search")
    public WebElement rightSearchButton;

    /**
     * Method that will allow to access options under my profile
     * @param option
     */
    public void selectOptionUnderProfile(String option){
        myProfileIcon.click();
        String locator = "//div[@class='menu-popup-items']//span[contains(.,'"+option+"')]";
        Driver.getDriver().findElement(By.xpath(locator)).click();
    }


}
