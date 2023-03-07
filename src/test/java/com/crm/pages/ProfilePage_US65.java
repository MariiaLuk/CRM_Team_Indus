package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage_US65 extends BasePage {

     public ProfilePage_US65(){
         PageFactory.initElements(Driver.getDriver(), this);
     }
@FindBy(xpath = "//a[@title='Activity Stream']")
    public WebElement activityStream;
@FindBy(xpath = "//a[@title='Tasks']")
 public WebElement tasks;
@FindBy(css = "a[title='Chat and Calls']")
    public WebElement chatAndCall;
@FindBy(css = "a[title='Workgroups']")
 public WebElement workGroups;


}
