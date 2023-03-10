package com.crm.step_definitions;

import com.crm.pages.ConfigureMenuPage_Omid;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US72_ConfigureMenu_StepDefs {
    ConfigureMenuPage_Omid page = new ConfigureMenuPage_Omid();

    @When("users click the CONFIGURE MENU option")
    public void users_click_the_configure_menu_option() {
        page.configureOption.click();
    }

    @Then("verify the users can see flowing {int} options:")
    public void verify_the_users_can_see_flowing_options(int num, List<String> list) {
        List<WebElement> listOfElements = Driver.getDriver().findElements(By.xpath("//span[@class ='menu-popup-item-text']"));

        Assert.assertEquals(num, listOfElements.size());

        for (int i = 0; i < listOfElements.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals(listOfElements.get(i).getText())) {
                    Assert.assertEquals(list.get(j), listOfElements.get(i).getText());
                    Assert.assertTrue(listOfElements.get(i).isDisplayed());
                    break;
                }
            }
        }
    }
}
