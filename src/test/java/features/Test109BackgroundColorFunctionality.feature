@Feature
Feature: Set Background Color Functionality Validation

Scenario: User should be able to change background color to sky blue
    Given Set SkyBlue Background button exists
    When User clicks on the Set SkyBlue Background button
    Then The background color will change to sky blue

Scenario: User should be able to change background color to white
    Given Set White Background button exists
    When User clicks on the Set White Background button
    Then The background color will change to white

