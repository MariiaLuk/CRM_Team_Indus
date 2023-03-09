package com.crm.step_definitions;

import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class US74_MobileApp_StepDefs {

    @Given("users are on the homepage")
    public void users_are_on_the_homepage() {
        String expectedTitle = "(39) Portal";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Then("verify the users see flowing {int} mobile app options:")
    public void verify_the_users_see_flowing_mobile_app_options(int mobileOptionsCount, List<String> expectedMobileAppOptions) {

        List<WebElement> mobileAppOptionsElements = Driver.getDriver().findElements(By.xpath("//div[@class='b24-app-block b24-app-mobile']//a"));

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(mobileAppOptionsElements.get(0)).perform();

        //verify there are two options available
        Assert.assertEquals(mobileOptionsCount,mobileAppOptionsElements.size());

        //verify each option is displayed and the text matches to the expected
        for (int i = 0; i < mobileAppOptionsElements.size(); i++) {
            Assert.assertTrue(mobileAppOptionsElements.get(i).isDisplayed());

            String actualText = mobileAppOptionsElements.get(i).getText();
            String expectedText = expectedMobileAppOptions.get(i);
            Assert.assertEquals(expectedText,actualText);
        }
        
    }

}
