Feature: login to saucedemo application

  @Login_Valid_User
  Scenario: login with valid user
    Given I am on login page
    When I am entering the <userName> and <passWord>
    Then Home page should display
