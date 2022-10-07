Feature: Logout
  As a user
  I want to logout
  So I can login again

  Scenario: Success logout
    Given I have logged in
    Then I click logout button
    When I will go to login page