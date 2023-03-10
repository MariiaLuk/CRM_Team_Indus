package com.crm.step_definitions;

import com.crm.pages.DrivePage_Anna;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US69_DriveModule_StepDefinitions {
   DrivePage_Anna drivePage_anna = new DrivePage_Anna();
    @When("users click the Drive page module on the homepage")
    public void users_click_the_drive_page_module_on_the_homepage() {
       drivePage_anna.driveButtonMainMenu.click();

    }

    @Then("anna verify the users see {int} options:")
    public void verify_the_users_see_options(int optionCount, List<String> expectedOptions) {
        List <WebElement> actualOptions = Driver.getDriver().findElements(By.xpath("//span[@class='main-buttons-item-text-title']"));
        Assert.assertEquals(optionCount,actualOptions.size());
        for (String eachOption: expectedOptions) {
           Assert.assertTrue(drivePage_anna.allDriveModules(eachOption).isDisplayed());
        }
        }
    }



