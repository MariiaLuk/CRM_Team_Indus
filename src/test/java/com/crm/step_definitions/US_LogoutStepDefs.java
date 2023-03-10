package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_LogoutStepDefs {

    LoginPage loginPage = new LoginPage();
    @Given("User is logged in")
    public void user_is_logged_in() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("help_desk_username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("help_desk_password"));
        loginPage.submit.click();
    }
    @Given("User clicks on profile name dropdown on the upper right corner")
    public void user_clicks_on_profile_name_dropdown_on_the_upper_right_corner(){
        loginPage.usersProfileDropdown.click();
    }
    @When("User clicks on logout button")
    public void user_clicks_on_logout_button() {
        loginPage.logoutOption.click();
    }
    @Then("User is able to log out successfully")
    public void user_is_able_to_log_out_successfully() {
       Assert.assertTrue(loginPage.userName.isDisplayed());
    }
}
