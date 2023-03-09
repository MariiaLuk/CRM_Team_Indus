package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US64_DesktopOptionsPage {

    public US64_DesktopOptionsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='b24-app-block-content-apps'][1]")
    public WebElement MacButton;
    @FindBy(css = "//span[.='Windows’]")
    public WebElement windowsButton;
    @FindBy(xpath = "//a[@style='width: 30%;']")
    public WebElement linuxButton;



}
