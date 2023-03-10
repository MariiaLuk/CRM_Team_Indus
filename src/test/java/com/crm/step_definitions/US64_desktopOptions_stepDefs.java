package com.crm.step_definitions;

import com.crm.pages.US64_DesktopOptionsPage;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US64_desktopOptions_stepDefs {


    US64_DesktopOptionsPage us64_desktopOptionsPage = new US64_DesktopOptionsPage();
    @Given("users are on the homeScreen")
    public void usersAreOnTheHomepage() {
        String expectedTitle= "Portal";
        String actualTitle= Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @Then("verify the users see flowing {int} desktop options")
    public void verifyTheUsersSeeFlowingDesktopOptions(int desktopOptions, List<String> expectedDesktopOptions) {

        List<WebElement> actualDesktopOptions = Driver.getDriver().findElements(By.xpath("//div[@class='b24-app-block b24-app-desktop']//a"));
        //verify the users see 3 desktop options
        Assert.assertEquals(desktopOptions,actualDesktopOptions.size());

        for (WebElement each : actualDesktopOptions) {
            Assert.assertTrue(each.isDisplayed());
        }


    }
}
