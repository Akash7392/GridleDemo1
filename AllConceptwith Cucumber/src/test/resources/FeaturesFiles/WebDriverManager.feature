@aks
Feature: to learn webdriver manager by naveen
  Scenario: to launch chrome with webdriver manager
#    Given Launch the chrome browser
#    When Navigate to any app and get the title

  Scenario Outline: parameterized webdriver manager
    Given to launch browser "<BrowserName>" with webdriver manager with parameter
    Examples:
      |BrowserName |
      |Edge      |