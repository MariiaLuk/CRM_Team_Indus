package com.crm.step_definitions;

import com.crm.pages.ChatAndCallsPage_Svetlana;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US67_StepDefinition {

    ChatAndCallsPage_Svetlana chatAndCallsModule = new ChatAndCallsPage_Svetlana();

    @When("users click the Chat and Calls module on the homepage")
    public void users_click_the_chat_and_calls_module_on_the_homepage() {
        chatAndCallsModule.navigateToModuleAndClick("Chat and Calls");
    }

    @Then("verify the users see {int} options:")
    public void verifyTheUsersSeeOptions(int optionsCount, List<String> expectedOptions) {
        List<WebElement> actualOptions = Driver.getDriver().findElements(By.xpath("//div[@class='bx-desktop-appearance-tab']//div[contains(@id,'bx-desktop-tab')]"));
        Assert.assertEquals(optionsCount, actualOptions.size());

        for (String eachOption : expectedOptions) {
            Assert.assertTrue(chatAndCallsModule.chatAndCallsOptions(eachOption).isDisplayed());
        }

    }
}
