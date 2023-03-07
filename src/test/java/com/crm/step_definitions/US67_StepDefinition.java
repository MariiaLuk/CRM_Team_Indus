package com.crm.step_definitions;

import com.crm.pages.ChatAndCallsPage_Svetlana;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US67_StepDefinition {

    ChatAndCallsPage_Svetlana chatAndCallsModule = new ChatAndCallsPage_Svetlana();
  @When("users click the Chat and Calls module on the homepage")
    public void users_click_the_chat_and_calls_module_on_the_homepage() {
        chatAndCallsModule.navigateToModuleAndClick("Chat and Calls");
    }

    @Then("verify the users see four options:")
    public void verify_the_users_see_four_options(List<String> options) {

        for (String eachOption : options) {
            Assert.assertTrue(chatAndCallsModule.chatAndCallsOptions(eachOption).isDisplayed());
        }
    }

}
