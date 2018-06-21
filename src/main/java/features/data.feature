Feature: FreeCRM Home Page

  Scenario: Login Page with valid data
    Given Free CRM home page
    Then enter the username and password
      | Giddaiah | Raghu123 |
    Then click the login button
    Then close the browser
