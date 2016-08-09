$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("scooplogin.feature");
formatter.feature({
  "line": 1,
  "name": "Shoop login",
  "description": "As a User\nI am able to login the shoop\nSo that I can work with my account",
  "id": "shoop-login",
  "keyword": "Feature"
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
  "duration": 3218574394,
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
  "duration": 586329742,
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
  "duration": 226077,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 623504637,
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
  "duration": 555021443,
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
  "duration": 421769008,
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
  "duration": 82914,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 234535968,
  "status": "passed"
});
});