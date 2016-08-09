$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cucumber/bdd/scooplogin.feature");
formatter.feature({
  "line": 1,
  "name": "Shoop login",
  "description": "As a User\nI am able to login the shoop\nSo that I can work with my account",
  "id": "shoop-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Login success and failure",
  "description": "",
  "id": "shoop-login;login-success-and-failure",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I visit the shoop sign-in page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I try to login with \u0027\u003cvalid-invalid\u003e\u0027 credentials",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see that I logged in \u0027\u003csuccessfully\u003e\u0027",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "shoop-login;login-success-and-failure;",
  "rows": [
    {
      "cells": [
        "valid-invalid",
        "status"
      ],
      "line": 12,
      "id": "shoop-login;login-success-and-failure;;1"
    },
    {
      "cells": [
        "VALID",
        "successfully"
      ],
      "line": 13,
      "id": "shoop-login;login-success-and-failure;;2"
    },
    {
      "cells": [
        "INVALID",
        "unsuccessfully"
      ],
      "line": 14,
      "id": "shoop-login;login-success-and-failure;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Login success and failure",
  "description": "",
  "id": "shoop-login;login-success-and-failure;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I visit the shoop sign-in page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I try to login with \u0027VALID\u0027 credentials",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see that I logged in \u0027\u003csuccessfully\u003e\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_visit_the_shoop_sign_in_page()"
});
formatter.result({
  "duration": 4250639314,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "VALID",
      "offset": 21
    }
  ],
  "location": "LoginSteps.i_try_to_login_with_valid_credentials(String)"
});
formatter.result({
  "duration": 566989551,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003csuccessfully\u003e",
      "offset": 31
    }
  ],
  "location": "LoginSteps.i_should_see_that_I_logged_in_successfully(String)"
});
formatter.result({
  "duration": 120884,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1044592006,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login success and failure",
  "description": "",
  "id": "shoop-login;login-success-and-failure;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I visit the shoop sign-in page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I try to login with \u0027INVALID\u0027 credentials",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see that I logged in \u0027\u003csuccessfully\u003e\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_visit_the_shoop_sign_in_page()"
});
formatter.result({
  "duration": 513387493,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "INVALID",
      "offset": 21
    }
  ],
  "location": "LoginSteps.i_try_to_login_with_valid_credentials(String)"
});
formatter.result({
  "duration": 416490194,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003csuccessfully\u003e",
      "offset": 31
    }
  ],
  "location": "LoginSteps.i_should_see_that_I_logged_in_successfully(String)"
});
formatter.result({
  "duration": 88993,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 236134822,
  "status": "passed"
});
});