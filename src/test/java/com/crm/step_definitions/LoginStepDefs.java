package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    LoginPage loginPage=new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username =null;
        String password =null;

        if(userType.equalsIgnoreCase("Hr users")){
            username = ConfigurationReader.getProperty("hr_username");
            password = ConfigurationReader.getProperty("hr_password");
        }else if(userType.equalsIgnoreCase("HelpDesk users")){
            username = ConfigurationReader.getProperty("help_desk_username");
            password = ConfigurationReader.getProperty("help_desk_password");
        }else if(userType.equalsIgnoreCase("Marketing users")){
            username = ConfigurationReader.getProperty("marketing_username");
            password = ConfigurationReader.getProperty("marketing_password");
        }
        //send username and password and login
        new LoginPage().login(username,password);
    }

    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
      LoginPage loginPage=new LoginPage();
      loginPage.login(username,password);
    }




    @And("Click the Login In button")
    public void clickTheLoginInButton() {
        LoginPage loginPage =new LoginPage();
        loginPage.submit.click();
    }

    @Then("verify user see {string}")
    public void verifyUserSee(String expectedErrorMessage) {
        BrowserUtils.waitForVisibility(loginPage.errorMessage,10);
        String actualErrorMessage = loginPage.errorMessage.getText();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }

    @When("User Enter an invalid {string} or {string}")
    public void userEnterAnInvalidOr(String username, String password) {
        loginPage.login(username,password);

     }
    }

