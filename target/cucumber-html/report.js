$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/Login.feature");
formatter.feature({
  "name": "Login Feature",
  "description": "  Description: This feature will be used to login to Simplilearn Application",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Verify that when user enters correct user name and password they should be able to login successfully",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has opened the Swaglab application",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters username \"\u003cUserName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters password \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "name": "User should be landed on the Products Page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ]
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify that when user enters correct user name and password they should be able to login successfully",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has opened the Swaglab application",
  "keyword": "Given "
});
formatter.match({
  "location": "loginsteps.user_has_opened_the_swaglab_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username \"standard_user\"",
  "keyword": "When "
});
formatter.match({
  "location": "loginsteps.user_enters_username_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password \"secret_sauce\"",
  "keyword": "And "
});
formatter.match({
  "location": "loginsteps.user_enters_password_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "loginsteps.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be landed on the Products Page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginsteps.user_should_be_landed_on_the_products_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify that when user enters Wrong user name and password they should be able to login successfully",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has opened the Swaglab application",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters username \"\u003cUserName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters password \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "name": "User should be getting the \"\u003cError\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password",
        "Error"
      ]
    },
    {
      "cells": [
        "standard_user",
        "secret",
        "Epic sadface: Username and password do not match any user in this service"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify that when user enters Wrong user name and password they should be able to login successfully",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has opened the Swaglab application",
  "keyword": "Given "
});
formatter.match({
  "location": "loginsteps.user_has_opened_the_swaglab_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username \"standard_user\"",
  "keyword": "When "
});
formatter.match({
  "location": "loginsteps.user_enters_username_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password \"secret\"",
  "keyword": "And "
});
formatter.match({
  "location": "loginsteps.user_enters_password_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "loginsteps.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be getting the \"Epic sadface: Username and password do not match any user in this service\"",
  "keyword": "Then "
});
formatter.match({
  "location": "loginsteps.user_should_be_getting_the_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});