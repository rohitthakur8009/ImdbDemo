Feature: Search Keywords Related to Movies, TV Shows and Cast
  As a user
  I want to be able see search IMBD
  So that I can get the details of my search
  
  Scenario: Search with valid KeyWords and see search Results
    Given I am on the Home Page
    When I have searched for 'Star Wars'
    And I click on the Search Button
    Then I am able to see Search Results across multiple Search Categories
  
  Scenario: Search with keywords and see predicive results
    Given I am on the Home Page
    When I have search for 'Stran'
    Then I am able to see 'Stranger Things' in the Predictive Search Results
    
  Scenario: Search with keywords for a specific Category
    Given I am on the Home Page
    When I have search for 'Avengers'
 	  And I have select 'Titles' in Subcategory
    And I click on the Search Button
    Then I am able to see search results for 'Titles' Category
    
  Scenario: Search with Invalid Keyword and see Search Result 
    Given I am on the Home Page
    When I have search for '%$#%^'
    And I click on the Search Button
    Then I am able to see to message for no results found
  
  Scenario: Search with Blank Input 
    Given I am on the Home Page
    When I have search for ' '
    And I click on the Search button
    Then I am able to see message to enter a search string
 
  
  Scenario: Submit Search by entering ''
    Given I am on the Home Page
    When I have search for ' '
    And I click on the Search button
    Then I am able to see to msg to enter a search string
    
     
    
