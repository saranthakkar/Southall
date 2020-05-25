Feature:
  Scenario: User is searching for flight from and to with departing and returning date
    Given User is on homepage of Southalltravel
    When User selects the airport in depart from box
    And User selects the airport in Destination box
    And User selects 27th May in departing calender
    And User selects 17th June in returning calender
    And User selects 3 in adult box
    And User selects Air India in Airline box
    And  User clicks on Search button
    Then User should be able to see result page
