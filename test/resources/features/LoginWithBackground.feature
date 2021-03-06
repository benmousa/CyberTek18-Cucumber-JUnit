@loginWithBackground

Feature: Login
  User Story: As a user, I should be able to login with correct credentials
  to different accounts. And dashboard should be displayed.

  Background: user is on login page
    Given user is on the login page

  Scenario: Librarian login scenario
    When user logs in as a librarian
    Then user should see the dashboard


  Scenario: Student login scenario
    When user logs in as a student
    Then user should see the dashboard

    @db
  Scenario: Admin login scenario
    When user logs in as an admin
    Then user should see the dashboard