Feature: FlyPgs Mobile Test
  Scenario: Opening FlyPgs mobile browser page and checking avaliable flights
    Given User opens phone
    When Opens google chrome browser
    When User writes flypgs web adress to google search bar
    When User accepts site cookies
    When User selects departure airport
    When User selects arrival airport
    When User clicks to search button
    When User clicks to filter
    When User filters flights for their price