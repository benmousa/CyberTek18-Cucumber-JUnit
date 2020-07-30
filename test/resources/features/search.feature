Feature: Search
  Agile Story: As a user, I should be able to search when I am om Google search

  Background: User should be on google search page
    Given User is on the google search page

  Scenario: Google default title verification
    Then user should see title is Google


  Scenario: Google title verification after search
    When user searches apple
    Then user should see apple in title


  Scenario: Google title verification after search
    When user searches "peach"
    Then user should see "peach" in the title


  Scenario: Google - Abiut- link page title verification
    Then user should see about link
    And user clicks to about link
    Then user should see title Google - About Google, Our Culture & Company News

    @googleTable
  Scenario: google search page footer links verification
    Then user should see six links in the footer
      | Advertising      |
      | Business         |
      | How Search Works |
      | Privacy          |
      | Terms            |
      | Settings         |




