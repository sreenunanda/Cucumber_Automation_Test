@tag
Feature: Login feature

  @positiveLogin
  Scenario Outline: positive login test
    Given Enter the user credentials <username> and <password>
    Then Verify the login title <status>

    Examples: 
      | username | password    | status                 |
      | student  | Password123 | Logged In Successfully |