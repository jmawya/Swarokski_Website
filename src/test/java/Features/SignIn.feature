Feature: Sign in
  Background:  Given Customer in swarovski homepage
    And customer clicks on Register button

  Scenario: Ensure customer successfully able to Log in  at swarovski
    And Customer enter their valid email log in page
    And Customer click on continue
    And Customer enter valid password in log in page
    When Customer click on sign in button
    Then Customer successfully able to Log in swarovski

  Scenario: Ensure customer is not able to Log in  at swarovski with invalid password
    And Customer enter their valid email log in page
    And Customer click on continue
    And Customer enter invalid password in log in page
    When Customer click on sign in button
    Then Customer is not able to Log in  at swarovski

  Scenario: Ensure customer is not able to Log in  at swarovski
    And Customer enter their invalid email in log in page
    When Customer click on continue
    Then Customer is not able to Log in  at swarovski with invalid email