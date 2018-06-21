$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Baburao/workspace/com.cucumber.selenium/freecrmBDDFramework/src/main/java/features/data.feature");
formatter.feature({
  "line": 1,
  "name": "Free_CRM_WebSite Page",
  "description": "",
  "id": "free-crm-website-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login with valid details Using DATA table",
  "description": "",
  "id": "free-crm-website-page;login-with-valid-details-using-data-table",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is main page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter username and password",
  "rows": [
    {
      "cells": [
        "Giddaiah",
        "Raghu123"
      ],
      "line": 6
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user click the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Datatble.user_is_main_page()"
});
formatter.result({
  "duration": 26372815150,
  "status": "passed"
});
formatter.match({
  "location": "Datatble.user_enter_username_and_password(DataTable)"
});
formatter.result({
  "duration": 1946708927,
  "status": "passed"
});
formatter.match({
  "location": "Datatble.user_click_the_login_button()"
});
formatter.result({
  "duration": 7256587050,
  "status": "passed"
});
formatter.match({
  "location": "Datatble.user_close_the_browser()"
});
formatter.result({
  "duration": 20724718,
  "status": "passed"
});
});