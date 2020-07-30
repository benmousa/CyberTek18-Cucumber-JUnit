package com.cybertek.step_definitions;

import com.cybertek.pages.WikiSearchPage;
import com.cybertek.utillities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class WikiVerificationStepDef {

    WikiSearchPage wikiSearchPage = new WikiSearchPage();


    @Given("user should see Wikipedia home page")
    public void user_should_see_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }

    @When("User types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {
        wikiSearchPage.searchBox.sendKeys("Steve Jobs");
    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikiSearchPage.searchButton.click();
    }
    @Then("User sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Steve Jobs - Wikipedia";

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Then("User sees Steve Jobs is in the main header")
    public void user_sees_steve_jobs_is_in_the_main_header() {
        String actualHeader = wikiSearchPage.mainHeader.getText();
        String expectedHeader = "Steve Jobs";
    }

    @When("User searches {string} in the wiki search page")
    public void user_searches_in_the_wiki_search_page(String search) {

        wikiSearchPage.searchBox.sendKeys(search + Keys.ENTER);
    }

    @Then("User sees {string} is in the  wiki title")
    public void user_sees_is_in_the_wiki_title(String search) {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = search + " - Wikipedia";
    }

    @Then("User sees {string} is in the main header")
    public void user_sees_is_in_the_main_header(String search) {

        String actualHeader = wikiSearchPage.mainHeader.getText();
        String expectedHeader = search;

        Assert.assertEquals(actualHeader, expectedHeader);
    }
    @Then("User sees {string} is in the image header")
    public void user_sees_is_in_the_image_header(String search) {

        String actualImage = wikiSearchPage.mainHeader.getText();
        String expectedImage = search;

        Assert.assertEquals(actualImage, expectedImage);
    }


    @Then("User should see {string} in the wiki title")
    public void user_should_see_in_the_wiki_title(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle + " - Wikipedia", actualTitle);
    }

    @Then("User should see {string} in the main header")
    public void user_should_see_in_the_main_header(String expectedHeader) {
        String actualHeader = wikiSearchPage.mainHeader.getText();
        Assert.assertEquals(expectedHeader, actualHeader);
    }
    @Then("User should see {string} in the image header")
    public void user_should_see_in_the_image_header(String expectedImage) {
        String actualmage = wikiSearchPage.imageHeader.getText();

        Assert.assertEquals(expectedImage, actualmage);
    }



}