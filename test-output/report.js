$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Baburao/workspace/com.cucumber.selenium/freecrmBDDFramework/src/main/java/features/NewCompany.feature");
formatter.feature({
  "line": 1,
  "name": "FreeCRM WebPage",
  "description": "",
  "id": "freecrm-webpage",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Create the new company Details",
  "description": "",
  "id": "freecrm-webpage;create-the-new-company-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User enter the home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter the \"\u003cUsername\u003e\"and\"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user click the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user mouse over the companies",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click the new company",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enter company details\"\u003cname\u003e\"and\"\u003cindustry\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user  click the logout",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user close browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "freecrm-webpage;create-the-new-company-details;",
  "rows": [
    {
      "cells": [
        "Username",
        "password",
        "name",
        "industry"
      ],
      "line": 14,
      "id": "freecrm-webpage;create-the-new-company-details;;1"
    },
    {
      "cells": [
        "Giddaiah",
        "Raghu123",
        "AWS",
        "Software"
      ],
      "line": 15,
      "id": "freecrm-webpage;create-the-new-company-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Create the new company Details",
  "description": "",
  "id": "freecrm-webpage;create-the-new-company-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User enter the home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter the \"Giddaiah\"and\"Raghu123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user click the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user mouse over the companies",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click the new company",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enter company details\"AWS\"and\"Software\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user  click the logout",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Company.user_enter_the_home_Page()"
});
formatter.result({
  "duration": 17005098364,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Giddaiah",
      "offset": 16
    },
    {
      "val": "Raghu123",
      "offset": 29
    }
  ],
  "location": "Company.user_enter_the_and(String,String)"
});
formatter.result({
  "duration": 1080492230,
  "status": "passed"
});
formatter.match({
  "location": "Company.user_click_the_login_button()"
});
formatter.result({
  "duration": 7689239841,
  "status": "passed"
});
formatter.match({
  "location": "Company.user_mouse_over_the_companies()"
});
formatter.result({
  "duration": 5169655442,
  "status": "passed"
});
formatter.match({
  "location": "Company.user_click_the_new_company()"
});
formatter.result({
  "duration": 251215009,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AWS",
      "offset": 27
    },
    {
      "val": "Software",
      "offset": 35
    }
  ],
  "location": "Company.user_enter_company_details_and(String,String)"
});
formatter.result({
  "duration": 1714905559,
  "status": "passed"
});
formatter.match({
  "location": "Company.user_click_the_logout()"
});
formatter.result({
  "duration": 186528733,
  "status": "passed"
});
formatter.match({
  "location": "Company.user_close_browser()"
});
formatter.result({
  "duration": 351439310,
  "status": "passed"
});
});