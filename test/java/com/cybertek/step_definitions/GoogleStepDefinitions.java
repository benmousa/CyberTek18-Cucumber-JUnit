package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utillities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import java.util.List;
public class GoogleStepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    //Some other steps were also undefined:

    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";

        Assert.assertEquals("Actual Title dose NOT match Expected Title!",actualTitle, expectedTitle);
        Assert.assertTrue("Actual Title dose NOT match Expected Title!",actualTitle.equals(expectedTitle));

    }

    @When("user searches apple")
    public void usersearchesApple() {

        GoogleSearchPage googleSearchPage = new GoogleSearchPage();
        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }

    @Then("user should see apple in title")
    public void userShouldSeeAppleInTitle() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "apple - Google Search";

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @When("user searches {string}")
    public void userSearches(String searchValue) {

        GoogleSearchPage googleSearchPage = new GoogleSearchPage();
        googleSearchPage.searchBox.sendKeys(searchValue + Keys.ENTER);
    }

    @Then("user should see {string} in the title")
    public void userShouldSeeInTheTitle(String searchValue) {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = searchValue + " - Google Search";

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Given("User is on the google search page")
    public void userIsOnTheGoogleSearchPage() {

        Driver.getDriver().get("https://www.google.com");
    }

    @Then("user should see about link")
    public void userShouldSeeAboutLink() {

        Assert.assertTrue(Driver.getDriver().findElement(By.id("hptl")).isDisplayed());
    }

    @And("user clicks to about link")
    public void userClicksToAboutLink() {
        Driver.getDriver().findElement(By.id("hptl")).click();
    }

    @Then("user should see title Google - About Google, Our Culture & Company News")
    public void userShouldSeeTitleGoogleAboutGoogleOurCultureCompanyNews() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google - About Google, Our Culture & Company News";

        Assert.assertEquals(actualTitle, expectedTitle);
    }


    @Then("user should see six links in the footer")
    public void user_should_see_six_links_in_the_footer(List<String> linkStrings ) {

        int expectedSize = linkStrings.size();
        int actualSize = googleSearchPage.footerLinks.size();
    }

    @Given("user is on google search page")
    public void userIsOnGoogleSearchPage() {
        Driver.getDriver().get("https://www.google.com");
    }


}
