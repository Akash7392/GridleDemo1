@A
Feature: New Admin Creation

  Scenario Outline: Verify creation of new admin
    Given Open OrangeHRM Application on "<WebbrowserName>" and "<URL>" browser
    When Enter the credentials "<Usaernme>" and "<Password>"
    Then Validate user is able to login
    Then Navigate to admin menu and select
    Then Add new user
    Then Select User role and status from dropdown
    Then Enter personal  details "<EmpName>" and "<username>" and "<password>" and "<ConfirmPassword>"
    Then svae the details
    Then  logout from appliction

    Examples:
    |WebbrowserName|URL|Usaernme|Password|EmpName|username|password|ConfirmPassword|
    |Chrome|https://opensource-demo.orangehrmlive.com/|Admin|admin123|   |Rit123  |@Rit123 |@Rit123|




