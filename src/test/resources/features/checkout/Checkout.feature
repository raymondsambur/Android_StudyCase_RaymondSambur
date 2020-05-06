@Android @Checkout
Feature: Checkout

  Background:
    Given User is on moka start page
    And User click sign in button on moka start page
    And User is on login page
    And User input "082189814330" as username
    And User input "Natalia24" as password
    And User click sign in button on login page
    And User is on moka main page

  @OneTransaction
  Scenario Outline: Transaction of one item type with one quantity
    When User click "<ItemName>" with quantity of <Quantity> in item list
    And User click charge button on shopping cart
    And User input cash amount of "<Cash>"
    And User click charge button on checkout pop up
    Then User see receipt page
    And User click new sale button
    Examples:
      | ItemName           | Quantity | Cash  |
      | Chicken Wings      | 1        | 50000 |
      | Chicken Drum Stick | 1        | 50000 |

  @TwoTransaction
  Scenario: Transaction of two different items with one quantity
    When User click "Chicken Wings" with quantity of 1 in item list
    And User click "Chicken Drum Stick" with quantity of 1 in item list
    And User click charge button on shopping cart
    And User input cash amount of "100000"
    And User click charge button on checkout pop up
    Then User see receipt page
    And User click new sale button

  @CashFirstSuggestion
  Scenario: Transaction using first cash payment suggestion
    When User click "Chicken Wings" with quantity of 1 in item list
    And User click charge button on shopping cart
    And User click first suggestion of cash payment
    And User click charge button on checkout pop up
    Then User see receipt page
    And User click new sale button

  @CashSecondSuggestion
  Scenario: Transaction using second cash payment suggestion
    When User click "Chicken Drum Stick" with quantity of 1 in item list
    And User click charge button on shopping cart
    And User click second suggestion of cash payment
    And User click charge button on checkout pop up
    Then User see receipt page
    And User click new sale button

  @ClearSale
  Scenario: Delete items in shopping cart
    When User click "Chicken Drum Stick" with quantity of 1 in item list
    And User click "Chicken Drum Stick" with quantity of 1 in item list
    Then User click clear sale button
