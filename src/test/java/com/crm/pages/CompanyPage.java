package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CompanyPage extends BasePage{

    public CompanyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "top_menu_id_about_3022125719")
    public WebElement officialInformation;

    @FindBy(id = "top_menu_id_about_4237431424")
    public WebElement ourLife;

    @FindBy(id = "top_menu_id_about_4184306755")
    public WebElement aboutCompany;

    @FindBy(id = "top_menu_id_about_3640681857")
    public WebElement photoGallery;

    @FindBy(id = "top_menu_id_about_2929033797")
    public WebElement video;

    @FindBy(id = "top_menu_id_about_1740701591")
    public WebElement career;

    @FindBy(id = "top_menu_id_about_1179521766")
    public WebElement businessNewsRSS;


    @FindBy(xpath = "//div[@data-top-menu-id='top_menu_id_about']//span[@class='main-buttons-item-text-title']")
    public List<WebElement> topSevenModules;


}
