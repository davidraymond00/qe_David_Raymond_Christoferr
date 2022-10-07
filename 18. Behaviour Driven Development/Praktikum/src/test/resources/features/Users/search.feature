Feature: Search
  As a user
  I want to search job
  So i can access search feature

  Scenario: first click search
    Given I go to first view
    Then I click search button
    When I will empty history

  Scenario: second click search
    Given I go to first view
    Then I click search button again
    When I will any history

  Scenario: invalid key search
    Given I go to search button
    When I input invalid key search
    And I click search button
    Then I will get empty search


