package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageRa extends BasePage {

     public LoginPageRa(){
         PageFactory.initElements(Driver.getDriver(), this);
     }
@FindBy(name ="USER_LOGIN")//name =
    public WebElement usernameBox;
@FindBy(css = "input[placeholder='Password']")
 public WebElement passwordBox;
@FindBy(css = "input[type='submit']")
    public WebElement loginButton;
@FindBy(xpath = "//span[.='CRM']")
 public WebElement homePage;
@FindBy(css = "a[onclick='bxFullscreenClose(); return false;']")
      public WebElement closeButton;

}
