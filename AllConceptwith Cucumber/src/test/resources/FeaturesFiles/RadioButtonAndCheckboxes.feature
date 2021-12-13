Feature: Learn radio button
  Scenario Outline: Radio button
    Given Navigate to applicaion and launch it
    When  Click on Radio <"Radio">button
    Then  Verify user is able to click

    Examples:
    |Radio|
    |Milk|