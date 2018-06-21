Feature: FreeCRM WebPage

  Scenario Outline: Create the new company Details
    Given User enter the home Page
    When user enter the "<Username>"and"<password>"
    Then user click the login button
    Then user mouse over the companies
    Then user click the new company
    Then user enter company details"<name>"and"<industry>"
    Then user  click the logout
    Then user close browser

    Examples: 
      | Username | password | name | industry |
      | Giddaiah | Raghu123 | AWS  | Software |
