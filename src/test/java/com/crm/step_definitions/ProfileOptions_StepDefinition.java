package com.crm.step_definitions;

import com.crm.pages.BasePage;
import com.crm.pages.LoginPage;
import com.crm.pages.LoginPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class ProfileOptions_StepDefinition {





    //Background
@Given("the user logged in to the home page")
public void theUserLoggedInToTheHomePage() {
}
//Background
    @Then("user locates the profile logo on the top right of the page")
    public void userLocatesTheProfileLogoOnTheTopRightOfThePage() {
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


    @Given("help desk users are on the homepage")
    public void helpDeskUsersAreOnTheHomepage() {
        Driver.getDriver().get("https://login2.nextbasecrm.com/");
        loginPage.userName.sendKeys("hr1@cybertekschool.com");
        loginPage.password.sendKeys("UserUser");
        loginPage.submit.click();
    }

    @When("help desk users click the profile name")
    public void helpDeskUsersClickTheProfileName() {
        loginPage.myProfileIcon.click();
        BrowserUtils.sleep(2);
    }

    @Then("Verify the help desk users see flowing options:")
    public void verifyTheHelpDeskUsersSeeFlowingOptions(List<String> expectedList) {
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


    @Given("marketing users are on the homepage")
    public void marketingUsersAreOnTheHomepage() {
        Driver.getDriver().get("https://login2.nextbasecrm.com/");
        loginPage.userName.sendKeys("hr1@cybertekschool.com");
        loginPage.password.sendKeys("UserUser");
        loginPage.submit.click();
    }

    @When("marketing users click the profile name")
    public void marketingUsersClickTheProfileName() {
        loginPage.myProfileIcon.click();
        BrowserUtils.sleep(2);
    }

    @Then("Verify the marketing users see flowing options:")
    public void verifyTheMarketingUsersSeeFlowingOptions(List<String> expectedList) {
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
