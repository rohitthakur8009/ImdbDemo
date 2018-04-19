Feature: Go to TV Show Details page from the Top Charts
  As a user
  I want to be able see view the Top TV Charts
  So that I can go the TV Show Details
  
  Scenario: Open TV Show Details from Top TV Charts
    Given I am on the Home Page
    When I go to Top TV Charts by clicking 'Top Rated TV Shows'
    And I go to TV Show Details page by Clicking 'Breaking Bad'
    Then I am able to see 'Breaking Bad' details page
