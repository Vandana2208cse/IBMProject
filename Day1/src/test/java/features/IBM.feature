#@tag
#Feature: Facebook Login
#
#
#@tag1
#Scenario: login facebook with valid credential
#Given User navigate to facebook application
#When User enters valid credential
#Then user logged in successfully
#
#Scenario: login facebook with invalid credential
#Given User navigate to facebook application
#When User enters invalid credential
#Then user gets validation message
Feature: Elearning Application Signup

  #Scenario: Signup into Elearning Application
  #Given User navigates to Elearning application
  #When user enters valid details
  #Then user signup in the application successfully
  @script1
  Scenario Outline: Signup into Elearning Application with valid datails
    Given User navigates to Elearning application
    When user enter "<firstname>" firstname and "<lastname>" lastname and "<email>" email and "<username>" username and "<password>" password and "<confirm password>" confirm password
    And user clicks on register button
    Then user redirect to dashboard

    Examples: 
      | firstname | lastname | email             | username | password | confirm password |
      | Vandana   | Singh    | vandana@singh.com | vandu987 |    12345 |            12345 |

  @script2part1
  Scenario Outline: Login into Elearning Application with valid credential
    Given User navigates to Elearning application
    When user enter "<username>" username and "<password>" password
    And user clicks on Login button
    Then user redirect to dashboad
    And user clicks on compose mail
    Then user choose recipient and enter subject line
    And Send the mail

    Examples: 
      | username | password |
      | vandu987 |    12345 |
