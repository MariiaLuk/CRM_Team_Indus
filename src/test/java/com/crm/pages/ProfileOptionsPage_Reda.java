package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class ProfileOptionsPage_Reda extends BasePage {

    public ProfileOptionsPage_Reda(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
