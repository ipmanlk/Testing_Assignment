
Feature: After logging in i should be able to create a user

  @TC_002
  Scenario Outline: Create user
    Given User in the Actitime Users page
    When User does something
    Then Users section should be visible
    Examples:
      |  |
