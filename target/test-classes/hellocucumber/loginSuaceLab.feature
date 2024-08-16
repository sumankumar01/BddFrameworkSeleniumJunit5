Feature: login to saucedemo application

  Scenario: login with valid user
    Given I am on login page
    When I am entering the <userName> and <passWord>
    Then Home page should display
