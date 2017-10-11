
Feature: Login Action

  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters ""qa1@mailforspam.com"" and ""123456""
    Then Message displayed Login Successfully

