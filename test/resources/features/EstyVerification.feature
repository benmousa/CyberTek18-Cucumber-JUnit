Feature:
  User story: Etsy, Title Verification


  Background:
    Given User is on https://www.etsy.com


    @lili
    Scenario: Etsy Title Verification
    Then User sees title is as expected

  @lili
  Scenario: Etsy Search Functionality Title Verification (without parameterization)
    When User types Wooden Spoon in the search box
    And User clicks search button
    Then User sees Wooden Spoon is in the title






