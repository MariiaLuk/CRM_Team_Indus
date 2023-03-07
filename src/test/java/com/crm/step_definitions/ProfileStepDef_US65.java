package com.crm.step_definitions;

import com.crm.pages.BasePage;
import com.crm.pages.LoginPage;
import com.crm.pages.ProfilePage_US65;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class ProfileStepDef_US65 {


    LoginPage loginPage=new LoginPage();

    ProfilePage_US65 profile=new ProfilePage_US65();
    //Background
@Given("the user logged in to the home page")
public void theUserLoggedInToTheHomePage() {
}
//Background
    @Then("user locates the profile logo on the top right of the page")
    public void userLocatesTheProfileLogoOnTheTopRightOfThePage() {
    }


    @Given("HR users are on the homepage")
public void usersAreOnTheHomepage() {
    Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    loginPage.userName.sendKeys("hr1@cybertekschool.com");
    loginPage.password.sendKeys("UserUser");
    loginPage.submit.click();
}

    @When("users click the profile name")
    public void usersClickTheProfileName() {
       profile.myProfileIcon.click();
    }


    @Then("Verify the users see flowing options:")
    public void verifyTheUsersSeeFlowingOptions(List<String> expectedList) {

        List<String> actualList=new ArrayList<>();

        actualList.add(profile.myProfileOption.getText());
        actualList.add(profile.editProfileSettingsOption.getText());
        actualList.add(profile.themesOption.getText());
        actualList.add(profile.configureNotificationsOption.getText());
        actualList.add(profile.logoutOption.getText());
        Assert.assertEquals(actualList,expectedList);

    }


}
