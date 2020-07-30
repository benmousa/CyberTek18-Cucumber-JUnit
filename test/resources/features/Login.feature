Feature: Login
  User Story: As a user, I should be able to login with correct credentials
  to different accounts. And dashboard should be displayed.


  @librarian @employee
  Scenario: Librarian login scenario
    Given user is on the login page
    When user logs in as a librarian
    Then user should see the dashboard

  @student
  Scenario: Student login scenario
    Given user is on the login page
    When user logs in as a student
    Then user should see the dashboard

    @admin @employee
  Scenario: Admin login scenario
    Given user is on the login page
    When user logs in as an admin
    Then user should see the dashboard