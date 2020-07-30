package com.cybertek.step_definitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LibraryLoginStepDefinitions {


    @When("user logs in as a librarian")
    public void user_logs_in_as_a_librarian() {
        System.out.println("-> user logs in as a librarian");
    }


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("-> user is on the login page");
    }
    //Some other steps were also undefined:


    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("-> user should see the dashboard");
    }

    @When("user logs in as a student")
    public void user_logs_in_as_a_student() {
        System.out.println("-> user logs in as a student");
    }

    @When("user logs in as an admin")
    public void user_logs_in_as_an_admin() {
        System.out.println("-> user logs in as an admin");
    }
}


