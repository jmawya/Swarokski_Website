Feature: Swarovski signup


  @signup
  Scenario:Ensure Customer Create a new account in swarovski
    Given Customer in swarovski homepage
    And customer clicks on Register button
    And customer enter their email
    And Customer click on continue
    And customer enter their password
    And customer agrees with terms and conditions
    When customer click on Join the Club button
    Then Customer succesfully able to join the club in swarovski

