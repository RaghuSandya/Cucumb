Feature: Free_CRM_WebSite Page

  Scenario: Login with valid details Using DATA table
    Given user is main page
    Then user enter username and password
      | username | password |
      | Giddaiah | Raghu123 |
    Then user click the login button
    Then user mouse over the  clcking newdeal
    Then user enter deal details
      | title | amount | commission |
      | AWS1  |   1201 |         20 |
      | AWS2  |   1202 |         10 |
      | AWS3  |   1203 |         30 |
   
    Then user close the browser
