package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.actions.LogoutSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class LogoutStepDefinitions {

    @Steps
    LogoutSteps logout;


    @When("I click the Log out button")
    public void iClickTheLogOutButton() {
        logout.iClickTheLogOutButton();
    }


    @Then("I should find the Login button on the page")
    public void iShouldFindTheLoginButtonOnThePage() {
        assertThat(logout.iShouldFindTheLoginButtonOnThePage().equals("Log in"));
    }
}
