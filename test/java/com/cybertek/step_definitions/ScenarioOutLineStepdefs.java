package com.cybertek.step_definitions;

import com.cybertek.pages.WikiSearchPage;
import com.cybertek.utillities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ScenarioOutLineStepdefs {

    WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @Given("user should see Wikipedia home-page")
    public void userShouldSeeWikipediaHomePage() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }

    @When("User searches {string} in the wiki search-page")
    public void userSearchesInTheWikiSearchPage(String arg0) {
        wikiSearchPage.searchBox.sendKeys(arg0);
        wikiSearchPage.searchButton.click();
    }

    @Then("User should see {string} in the wiki-title")
    public void userShouldSeeInTheWikiTitle(String arg0) {
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, arg0);
    }

    @Then("User should see {string} in the main-header")
    public void userShouldSeeInTheMainHeader(String arg0) {
        String actualMainHeader = wikiSearchPage.mainHeader.getText();

        Assert.assertEquals(actualMainHeader, arg0);
    }

    @Then("User should see {string} in the image-header")
    public void userShouldSeeInTheImageHeader(String arg0) {
        String actualImageHeader = wikiSearchPage.mainHeader.getText();

        Assert.assertEquals(actualImageHeader, arg0);
    }
}
