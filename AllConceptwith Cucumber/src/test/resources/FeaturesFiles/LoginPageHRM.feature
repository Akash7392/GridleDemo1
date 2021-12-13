
@AKASH
 #Feature:Login functionality

#  Scenario Outline: Verify application title
#    Given Open OrangeHRM Application on "<WebbrowserName>" and "<URL>" browser
#    Then  Validate application name
#    Then  logout from appliction
#    Examples:
#    |WebbrowserName|
#    |Chrome |
#  Scenario Outline: to vrify login fumtionality
#    Given Open OrangeHRM Application on "<Usaernme>" and "<URL>" browser
#    When Enter the credentials "<Usaernme>" and "<Password>"
#    Then Validate user is able to login
#    Then  logout from appliction
#    Examples:
#      |Usaernme|Password||WebbrowserName|URL|
#      |Admin   |admin123||Chrome |https://opensource-demo.orangehrmlive.com/|

#  Scenario Outline: Verify validation on entering wrong username and password
#    Given Open OrangeHRM Application on "<WebbrowserName>" and "<URL>" browser
#    When Enter the credentials "<Usaernme>" and "<Password>"
#    Then Validate user is able to login
#    Then Validate user id getting correct alert message
#    Then  logout from appliction
#
#    Examples:
#      |Usaernme|Password|
#      |Adminss   |123456|
#   Examples:
#     |WebbrowserName|URL|
#     |Chrome |https://opensource-demo.orangehrmlive.com|

