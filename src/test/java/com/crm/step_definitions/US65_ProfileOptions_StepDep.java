package com.crm.step_definitions;

import com.crm.pages.BasePage;
import com.crm.pages.ProfileOptionsPage_Reda;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class US65_ProfileOptions_StepDep {
   ProfileOptionsPage_Reda profileOptions=new ProfileOptionsPage_Reda();
    @When("users click the profile name")
    public void users_click_the_profile_name() {
        profileOptions.myProfileIcon.click();

    }
    @Then("verify the HR users see flowing five options:")
    public void verify_the_hr_users_see_flowing_five_options(List<String> expectedOptions) {

        List<String> actualOptions=new ArrayList<>();
        actualOptions.add(profileOptions.myProfileOption.getText());
        actualOptions.add(profileOptions.editProfileSettingsOption.getText());
        actualOptions.add(profileOptions.themesOption.getText());
        actualOptions.add(profileOptions.configureNotificationsOption.getText());
        actualOptions.add(profileOptions.logoutOption.getText());
        Assert.assertEquals(actualOptions,expectedOptions);
    }

}
