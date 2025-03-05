@Test
Feature: Testing the amazon availability

  Scenario Outline: As a customer when I search Alexa, I want to see if the
  third option in the second page is available for purchase and can
  be added to the car
    Given The user navigates in Amazon
    And Search for <product>
    And navigates to the second page
    And select the third item
    Then the user is able to add the product to the car
    Examples:
    |product|
    |Alexa  |
    |Mickey |

