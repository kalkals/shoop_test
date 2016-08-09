Feature: Shoop login
As a User
I am able to login the shoop
So that I can work with my account
@login
Scenario Outline: Login success and failure
Given I visit the shoop sign-in page
When I try to login with '<valid-invalid>' credentials
Then I should see that I logged in '<successfully>'

Examples:
| valid-invalid   |  status       |
|VALID    |  successfully |
|INVALID  | unsuccessfully|
