package com.cybertek.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;

public class DataTableStepdefs {

    @Then("user should see below words")
    public void user_should_see_below_words(List<String> fruits) {

        System.out.println(fruits.size());

    }

}
