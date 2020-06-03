Feature: login
  Scenario: facebook home page
    Given user is on login page
    When when user enters password and username
    Then home page of the User is visibile
    And click on the profile
