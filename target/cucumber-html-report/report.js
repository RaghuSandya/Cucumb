$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Baburao/workspace/com.cucumber.selenium/freecrmBDDFramework/src/main/java/com/qa/feature/freeCRM.feature");
formatter.feature({
  "line": 1,
  "name": "FreeCRM_Application Test",
  "description": "",
  "id": "freecrm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate FreeCrm home page Test",
  "description": "",
  "id": "freecrm-application-test;validate-freecrm-home-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is enter username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "home page tilte validates",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicking the logout",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_is_open_browser()"
});
formatter.result({
  "duration": 10890720904,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_enter_username_and_password()"
});
formatter.result({
  "duration": 5035691988,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@placeholder\u003d\u0027Username\u0027]\"}\nCommand duration or timeout: 26 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027Baburao-PC\u0027, ip: \u0027192.168.74.1\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d46.0, platform\u003dWINDOWS, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 52ba5c94-af45-40c3-9987-6e5de5e39047\n*** Element info: {Using\u003dxpath, value\u003d//input[@placeholder\u003d\u0027Username\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat com.qa.pages.LoginPage.Username(LoginPage.java:24)\r\n\tat com.qa.stepDefination.HomePageSteps.user_is_enter_username_and_password(HomePageSteps.java:21)\r\n\tat ✽.Then user is enter username and password(C:/Users/Baburao/workspace/com.cucumber.selenium/freecrmBDDFramework/src/main/java/com/qa/feature/freeCRM.feature:5)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@placeholder\u003d\u0027Username\u0027]\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027Baburao-PC\u0027, ip: \u0027192.168.74.1\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///C:/Users/Baburao/AppData/Local/Temp/anonymous8077965806638243326webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10770)\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElement(file:///C:/Users/Baburao/AppData/Local/Temp/anonymous8077965806638243326webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10779)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_/h(file:///C:/Users/Baburao/AppData/Local/Temp/anonymous8077965806638243326webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12661)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_(file:///C:/Users/Baburao/AppData/Local/Temp/anonymous8077965806638243326webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12666)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.execute/\u003c(file:///C:/Users/Baburao/AppData/Local/Temp/anonymous8077965806638243326webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12608)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HomePageSteps.home_page_tilte_validates()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSteps.user_clicking_the_logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSteps.user_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});