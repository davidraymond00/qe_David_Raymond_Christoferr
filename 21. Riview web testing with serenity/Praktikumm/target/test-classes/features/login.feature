Feature: Login
  As a user
  I want to login
  So i can access my dashboard

  Scenario: Login with locked account
    Given I am on the login page
    When I input locked username
    And I input valid password
    And I click login button
    Then I will get error message

  Scenario: Login with standard user
    Given I am on the login page
    When I input standard username
    And I input valid password
    And I click login button
    Then I success login

  Scenario: Login with problem user
    Given I am on the login page
    When I input problem username
    And I input valid password
    And I click login button
    Then I success login

  Scenario: Login with performance glitch user
    Given I am on the login page
    When I input performance glitch user
    And I input valid password
    And I click login button
    Then I success login

  Scenario: Login with null username and password
    Given I am on the login page
    When I input null username
    And I input null password
    And I click login button
    Then I will get error message