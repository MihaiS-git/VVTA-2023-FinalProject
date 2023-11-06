package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import starter.actions.PlaceAnOrderNonValidCredentialsSteps;

public class PlaceAnOrderNonValidCredentialsStepDefinitions {
    PlaceAnOrderNonValidCredentialsSteps badOrder;

    @Then("I accept the alert")
    public void iAcceptTheAlert() {
        badOrder.iAcceptTheAlert();
    }

    @Then("I close the form")
    public void iCloseTheForm() {
        badOrder.iCloseTheForm();
    }
}
