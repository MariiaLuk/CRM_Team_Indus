package com.crm.pages;


import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement userName;


    @FindBy(name = "USER_PASSWORD")
    public WebElement password;

    @FindBy(css = "input[type='submit']")
    public WebElement submit;


    @FindBy(xpath = "//div[.='Incorrect login or password']")
    public WebElement errorMessage;

    @FindBy(xpath = "//label[.='Remember me on this computer']")
    public WebElement remember_me_check_box_text;

    @FindBy(id = "USER_REMEMBER")
    public WebElement remember_me_check_box;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        BrowserUtils.sleep(2);
        submit.click();
        // verification that we logged
    }

}
