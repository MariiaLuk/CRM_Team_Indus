package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class LoginStepDefs {


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

    LoginPage loginPage=new LoginPage();
    @Given("HR users are on the homepage")
    public void usersAreOnTheHomepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.userName.sendKeys("hr1@cybertekschool.com");
        loginPage.password.sendKeys("UserUser");
        loginPage.submit.click();
    }

    @When("users click the profile name")
    public void usersClickTheProfileName() {
        loginPage.myProfileIcon.click();

    }


    @Then("Verify the users see flowing options:")
    public void verifyTheUsersSeeFlowingOptions(List<String> expectedList) {

        List<String> actualList=new ArrayList<>();

        actualList.add(loginPage.myProfileOption.getText());
        actualList.add(loginPage.editProfileSettingsOption.getText());
        actualList.add(loginPage.themesOption.getText());
        actualList.add(loginPage.configureNotificationsOption.getText());
        actualList.add(loginPage.logoutOption.getText());
        //System.out.println(expectedList);
        //System.out.println("actualList = " + actualList);
        Assert.assertEquals(actualList,expectedList);

    }





}
