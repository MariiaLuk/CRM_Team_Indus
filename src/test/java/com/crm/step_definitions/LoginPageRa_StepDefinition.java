package com.crm.step_definitions;

import com.crm.pages.BasePage;
import com.crm.pages.LoginPageRa;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginPageRa_StepDefinition {
          LoginPageRa loginPageRa=new LoginPageRa();

    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get("https://login2.nextbasecrm.com/");

    }
    @When("user use username {string} and passcode {string}")
    public void userUseUsernameAndPasscode(String arg0, String arg1) {
        loginPageRa.usernameBox.sendKeys("hr1@cybertekschool.com");
        loginPageRa.passwordBox.sendKeys("UserUser");


    }
    @When("user click the login button")
    public void user_click_the_login_button() {
        loginPageRa.loginButton.click();

    }
    @Then("verify the user should be at the home page")
    public void verify_the_user_should_be_at_the_home_page() {
        BrowserUtils.sleep(2);
        loginPageRa.activityStream.click();
        BrowserUtils.sleep(3);
        loginPageRa.tasks.click();
        BrowserUtils.sleep(3);
        loginPageRa.chatAndCall.click();
        loginPageRa.closeButton.click();
        BrowserUtils.sleep(3);
        loginPageRa.workGroups.click();
        BrowserUtils.sleep(3);
        loginPageRa.homePage.isDisplayed();
    }


}
