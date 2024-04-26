Feature: filter and add to cart Functionality

  Scenario: add to cart Functionality
    Given navigate to amzon homepage
    When Click on fashion and click on mens
    When Fileter by Average custumor review 4 stars and up
    When Filter by price 1000-5000
    When Select puma and Allen Solley in brands
    When Count the number of result in first page and log to console
    When Click the second product  and add to cart
    And Validate Number and Cart is increased by 1