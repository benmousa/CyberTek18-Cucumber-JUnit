package com.cybertek.step_definitions;

import com.cybertek.pages.PageEstyVerification;
import com.cybertek.utillities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EstyVerificationStepDefinition {
    PageEstyVerification pageTasks = new PageEstyVerification();

    @Then("User sees title is as expected")
    public void userSeesTitleIsAsExpected() {
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @When("User types Wooden Spoon in the search box")
    public void userTypesWoodenSpoonInTheSearchBox() {

        pageTasks.searchBox.sendKeys("Wooden Spoon");
    }

    @And("User clicks search button")
    public void userClicksSearchButton() {

        pageTasks.searchButton.click();
    }

    @Then("User sees Wooden Spoon is in the title")
    public void userSeesWoodenSpoonIsInTheTitle() {
        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(expectedTitle.contains(actualTitle));
    }

    @Given("User is on https:\\/\\/www.etsy.com")
    public void userIsOnHttpsWwwEtsyCom() {

        Driver.getDriver().get("https://www.etsy.com");
    }
}
