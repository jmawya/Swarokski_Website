Feature: Forgate password

  Scenario: Ensure student successfully recover their password
    Given Customer in swarovski homepage
    And customer clicks on Register button
    And Customer enter their valid email log in page
    And Customer click on continue
    And Customer click on forgot password link
    And Customer click on submit button
    And Customer at gmail homepage
    And Customer enter their valid email from google sign in page



