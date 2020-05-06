@Android @Login
Feature: Login

  @TestLogin
  Scenario Outline: login with correct username and password
    Given User is on moka start page
    When User click sign in button on moka start page
    And User is on login page
    And User input "<Username>" as username
    And User input "<Password>" as password
    Then User click sign in button on login page
    And User is on moka main page
    Examples:
      | Username                | Password  |
      | 082189814330            | Natalia24 |
      | +6282189814330          | Natalia24 |

  @ErrorMessage
  Scenario: Check wrong email error message
    Given User is on moka start page
    When User click sign in button on moka start page
    And User is on login page
    Then User input "email" as username
    And User see wrong username message