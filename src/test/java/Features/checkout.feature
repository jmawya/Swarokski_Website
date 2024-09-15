Feature: Checkout
  Scenario: Customer add a item in the cart then they are able checkout
    Given Customer in swarovski homepage
    And Customer click in search icon
    And Customer type Chroma drop earrings in search edit box and click enter from search edit box
    And Customer able to see list of  in search result page
    And Customer click on Chroma drop earrings item
    And Customer on add to bag button
    And Customer click on shoping bag link
    And Customer click on  checkout
    And customer enter valid email
    And Customer enter valid password in log in page
    And Customer click on sign in button
    And Customer click on  checkout
    And Customer click on continue button from checkout page
    And Customer enter card holder name
    And Customer enter valid card number
    And Customer enter card expire date
    And Customer enter valid security code
    When customer click on continue


  Scenario: Customer add a item in the cart then they are able checkout using goople pay
    Given Customer in swarovski homepage
    And Customer click in search icon
    And Customer type Chroma drop earrings in search edit box and click enter from search edit box
    And Customer able to see list of  in search result page
    And Customer click on Chroma drop earrings item
    And Customer on add to bag button
    And Customer click on shoping bag link
    And Customer click on  checkout
    And customer enter valid email
    And Customer enter valid password in log in page
    And Customer click on sign in button
    And Customer click on  checkout
    And Customer click on continue button from checkout page
    And Customer click google pay
    And customer click on continue button checkout
    And customer al review page
    When click on buy now button

