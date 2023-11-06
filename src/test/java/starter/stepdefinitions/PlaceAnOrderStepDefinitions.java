package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.actions.PlaceAnOrderSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class PlaceAnOrderStepDefinitions {
    @Steps
    PlaceAnOrderSteps order;

    @When("I click the Cart button")
    public void iClickTheCartButton() {
        order.iClickTheCartButton();
    }

    @When("I click the Place Order button")
    public void iClickThePlaceOrderButton() {
        order.iClickThePlaceOrderButton();
    }

    @When("I enter the Name {}")
    public void iEnterTheName(String arg0) {
        order.iEnterTheName(arg0);
    }

    @When("I enter the Country {}")
    public void iEnterTheCountry(String arg0) {
        order.iEnterTheCountry(arg0);
    }

    @When("I enter the City {}")
    public void iEnterTheCity(String arg0) {
        order.iEnterTheCity(arg0);
    }

    @When("I enter the Credit Card {}")
    public void iEnterTheCreditCard(String arg0) {
        order.iEnterTheCreditCard(arg0);
    }

    @When("I enter the Month {}")
    public void iEnterTheMonth(String arg0) {
        order.iEnterTheMonth(arg0);
    }

    @When("I enter the Year {}")
    public void iEnterTheYear(String arg0) {
        order.iEnterTheYear(arg0);
    }

    @When("I click Purchase button")
    public void iClickPurchaseButton() {
        order.iClickPurchaseButton();
    }

    @Then("I should see the {} thank you message")
    public void iShouldSeeTheThankYouMessage(String arg0) {
        assertThat(order.getTheSuccessMessage().equals(arg0));
    }

    @Then("I click Ok button")
    public void iClickOkButton() {
        order.iClickOkButton();
    }
}
