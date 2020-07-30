Feature:
  User story: Wikipedia Title Verification

  Background:
    Given user should see Wikipedia home page


  Scenario: Wikipedia Search Functionality Title Verification
    Then User sees Steve Jobs is in the wiki title

  Scenario: Wikipedia Search Functionality Header Verification
    Then User sees Steve Jobs is in the main header

  Scenario: Wikipedia Search Functionality Image Header Verification
    When User searches "Steve Jobs" in the wiki search page
    Then User sees "Steve Jobs" is in the  wiki title
    Then User sees "Steve Jobs" is in the main header
    Then User sees "sdfdfdfd" is in the image header

  @wiki
  Scenario Outline: Search functionality header verification
    When User searches "<searchValue>" in the wiki search page
    Then User should see "<expectedTitle>" in the wiki title
    Then User should see "<expectedMainHeader>" in the main header
    Then User should see "<expectedImageHeader>" in the image header

    Examples: example test data for wikipedia search
      | searchValue     | expectedTitle   | expectedMainHeader | expectedImageHeader |
      | Steve Jobs      | Steve Jobs      | Steve Jobs         | Steve Jobs          |
      | John Travolta   | John Travolta   | John Travolta      | John Travolta       |
      | Albert Einstein | Albert Einstein | Albert Einstein    | Albert Einstein     |
      | Keanu Reeves    | Keanu Reeves    | Keanu Reeves       | Keanu Reeves        |
      | Bruce Lee       | Bruce Lee       | Bruce Lee          | Bruce Lee           |
      | Dua Lipa        | Dua Lipa        | Dua Lipa           | Dua Lipa            |
      | Thomas Edison   | Thomas Edison   | Thomas Edison      | Thomas Edison       |
      | Sam Heughan     | Sam Heughan     | Sam Heughan        | Sam Heughan         |
      | Captain America | Captain America | Captain America    | Captain America     |
      | Beyoncé         | Beyoncé         | Beyoncé            | Beyoncé             |
      | Steve Jobs      | Steve Jobs      | Steve Jobs         | Steve Jobs          |
      | John Travolta   | John Travolta   | John Travolta      | John Travolta       |
      | Albert Einstein | Albert Einstein | Albert Einstein    | Albert Einstein     |
      | Keanu Reeves    | Keanu Reeves    | Keanu Reeves       | Keanu Reeves        |
      | Bruce Lee       | Bruce Lee       | Bruce Lee          | Bruce Lee           |
      | Dua Lipa        | Dua Lipa        | Dua Lipa           | Dua Lipa            |
      | Thomas Edison   | Thomas Edison   | Thomas Edison      | Thomas Edison       |
      | Sam Heughan     | Sam Heughan     | Sam Heughan        | Sam Heughan         |
      | Captain America | Captain America | Captain America    | Captain America     |
      | Beyoncé         | Beyoncé         | Beyoncé            | Beyoncé             |
