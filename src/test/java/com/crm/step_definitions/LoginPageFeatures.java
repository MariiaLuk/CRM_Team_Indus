package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginPageFeatures {
    LoginPage login = new LoginPage();

    @Given("the users go to the login page")
    public void the_users_go_to_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @Then("Verify there is a “Remember me on this computer” message displayed")
    public void verify_there_is_a_remember_me_on_this_computer_message_displayed() {
        String expectedTex = "Remember me on this computer";
        String actual = login.remember_me_check_box_text.getText();
        Assert.assertEquals(expectedTex, actual);

    }
    @Then("Then verify the check box is clickable")
    public void then_verify_the_check_box_is_clickable() {
        login.remember_me_check_box.click();
        Assert.assertTrue(login.remember_me_check_box.isSelected());

    }
}
