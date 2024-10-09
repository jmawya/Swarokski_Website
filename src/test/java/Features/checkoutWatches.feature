Feature: Checkout
  Scenario: Ensure user successfully able to checkout at Swarokski website
    Given customer at swarovski homepage
    And customer click on search icon
    And customer type crystal watches in search edit box and click on search icon
    And customer able to see list of search result page
    And customer click on Dextera Chain watch item
    And customer click on add to bag button
    And customer click on view shopping card
    And customer click on checkout button
    And customer enter an valid email address and click on continue button
    And customer enter an valid password and click on login button
    And customer click on checkout button
    And customer click on continue button from address page
    And Customer enter card holder name
    And customer enter their card number
    And customer enter their card valid until
    And customer enter their security code
    And customer click on continue button from checkout page