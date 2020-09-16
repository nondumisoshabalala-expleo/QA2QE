Feature: View products

  As a Visitor
  I want to search products
  So that I can view the product list page

  Scenario: Visitor wants to view women's tops product list
    Given I am a visitor
    When I navigate to the woman tops product list
    Then the womans top product list will be displayed

