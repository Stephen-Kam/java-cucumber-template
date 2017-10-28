Feature: As an employee of a drinks company, I want to know if my company is liable to pay the sugar levy

  @smoke
  Scenario: A small producer who makes their own products entirely. They should not register for SDIL while they maintain this state.
    Given the user is at the start of the liability tool
    And they start the liability process
    When the user indicates that they are liable for drinks they manufacture from a production site they operate
    And they indicate that they manufacture liable drinks for their own brands
    When the user enters in how much liable drink they manufacture for their own brands: 50000
    And the user indicates that they do not commission contract packers
    When the user indicates that they do not import liable drinks into the UK
    Then the check your answers page will be visible
    And the user's entered values will be correct
    When the user continues
    Then the correct response will be displayed: "invalid"
