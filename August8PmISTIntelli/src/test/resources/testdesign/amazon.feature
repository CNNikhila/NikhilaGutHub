Feature: Amazon Home Page validation

  @amazon
  Scenario: Search functionality
    Given user navigate to Amazon HomePage
    When user enter the product name "keyboard"
    And user clicks the search icon
    Then user validate the title of the page
    And user validate the search results

    @smoketest
    Scenario: baby wishlist page navigation
      Given user navigate to Amazon HomePage
      When  user click baby wish list option from Account menu
      Then validate the navigation

      Scenario Outline: Search functionality with multipal test data
        Given  user navigate to Amazon HomePage
        When  user enter the product name "<productName>"
        And user clicks the search icon
        Then user validate the title of the page
        And user validate the search results
        Examples:
          | ProductName |
          | iPhone      |
          | mouse       |
          | laptop      |

      @Amazon12
        Scenario: Handling of static dropdown
          Given user navigate to Amazon HomePage
          When  user select the dropdown value from category dropdown
          And user extracts the dropdown values
          Then validate the dropdown values



