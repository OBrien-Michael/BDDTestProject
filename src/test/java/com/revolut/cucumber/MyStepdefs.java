package com.revolut.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {

  @Given("Conor has {int} euro in his Revolut account")
  public void conorHasEuroInHisRevolutAccount(int arg0) {
  }

  @And("Conor enters a top up amount of {int} euro")
  public void conorEntersATopUpAmountOfEuro(int arg0) {
  }

  @And("Conor selects his debitCard as his top up method")
  public void conorSelectsHisDebitCardAsHisTopUpMethod() {
  }

  @And("card is valid")
  public void cardIsValid() {
  }

  @When("Conor's top up is approved")
  public void conorSTopUpIsApproved() {
  }

  @Then("The new balance of Conor's euro account should now be {int} euros")
  public void theNewBalanceOfConorSEuroAccountShouldNowBeEuros(int arg0) {
  }
}
