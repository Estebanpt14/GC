Feature: Test acciones en un pagina

  Rule: The user can return a city and validate them

  @List
  Scenario Outline: As a test engineer I want to validate that a text is present inside the list
    Given I navigate to the list page
    When I search <state> in the list
    Then I can find the <city> in the list

    Examples:
    |state     |city                   |
    |Washington|Seattle, Washington    |
    |California|Los Angeles, California|