Feature: The numbers of products

  Scenario Outline:
    Given Go to browser
    And Navigate to Etsy website
    And click Accept button
    When Enter "<searchProduct>" on search line
    And click search button
    Then Get numbers of products by text

    Examples:
      | searchProduct |
      | iphone        |
