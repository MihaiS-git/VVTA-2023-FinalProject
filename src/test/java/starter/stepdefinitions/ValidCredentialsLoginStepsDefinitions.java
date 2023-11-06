package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import starter.actions.LoginSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidCredentialsLoginStepsDefinitions {

    @Steps
    LoginSteps login;


    @Then("I should see the {string} welcome message")
    public void iShouldSeeTheWelcomeMessage(String string) {
        assertThat(login.getTheWelcomeNameMessage().equals(string));
    }
}

