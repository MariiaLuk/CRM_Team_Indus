package com.crm.step_definitions;

import com.crm.pages.CompanyPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US73_CompanyPageStepDefs {

    CompanyPage companyPage = new CompanyPage();

    @When("users click the Company module")
    public void users_click_the_company_module() {
        companyPage.companyModule.click();
    }

    @Then("verify the users see flowing {int} options:")
    public void verify_the_users_see_flowing_options(int countModules, List<String> expectedModules) {
        Assert.assertEquals(countModules,companyPage.topSevenModules.size());

        for (int i = 0; i < companyPage.topSevenModules.size(); i++) {
            Assert.assertEquals(expectedModules.get(i),companyPage.topSevenModules.get(i).getText());
            Assert.assertTrue(companyPage.topSevenModules.get(i).isDisplayed());
        }



    }


}
