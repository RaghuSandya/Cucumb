Feature: Free_CRM_User login and Conatcts details

  Scenario Outline: User fill the contact details
    Given User already FREE_CRM Page
    Then User enter the "<Username>" and "<Password>"
    Then User clicking the login button
    Then user mouse over the contact
    Then user clicking the new contact
    Then user enter contact details "<firstname>" and "<lastname>"and "<position>"
    Then user click the save button
    Then user clcik the logout button
    Then user close the browser

    Examples: 
      | Username | Password | firstname | lastname | position |
      | Giddaiah | Raghu123 | giddu     | Mos      | Tester   |
