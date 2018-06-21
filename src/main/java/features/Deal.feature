Feature: Free_CRM-Deals Page

  Scenario Outline: Enter the Deal Details
    Given User already FREE_CRM Page
    Then User enter the "<Username>" and "<Password>"
    Then User clicking the login button
    Then user mouse over the deal
    Then user clicking the new deal
    Then user enter deal details "<title>" and "<amount>"and "<commission>"
    Then user click the save button
    Then user clcik the logout button
    Then user close the browser

    Examples: 
      | Username | Password | title | amount | commission |
      | Giddaiah | Raghu123 | GGS   |   1000 |         80 |
