Feature: TopUp revolut account
 This feature describes various scenarios for topping up revolut account

  # As a user I want to top up my revolut account using my debit or credit card
  # Taken from Week9 Video adding a feature file

  Scenario: The card is valid and the account has credit
    Given Conor has 10 euro in his Revolut account
    And Conor enters a top up amount of 100 euro
    And Conor selects his debitCard as his top up method
    And card is valid
    When Conor's top up is approved
    Then The new balance of Conor's euro account should now be 110 euros
