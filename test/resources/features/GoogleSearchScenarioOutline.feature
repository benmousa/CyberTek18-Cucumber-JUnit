Feature: Search
  Agile Story: As a user, I should be able to search when I am on Google search page.

  @scenarioOutline
  Scenario Outline: : Google title verification after search.
    Given user is on google search page
    When user searches "<searchValue>"
    Then user should see "<expectedTitle>" in the title

    Examples: Search value I want to search in google
      | searchValue | expectedTitle |
      | apple       | apple         |
      | kiwi        | kiwi          |
      | orange      | orange        |


