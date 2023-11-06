package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.actions.LoginNavigateSteps;
import starter.actions.LoginSteps;

public class NonValidCredentialsLoginStepsDefinitions {

    @Steps
    LoginNavigateSteps navigate;

    @Steps
    LoginSteps login;

    @Given("I am on the Home Page")
    public void iAmOnTheHomePage() {
        navigate.opensTheHomePage();
    }

    @When("I click the Login button")
    public void iClickTheLoginButton() {
        login.getLoginPage();
    }

    @When("I enter the username {string}")
    public void iEnterTheUsername(String string) {
        login.iEnterTheUsername(string);
    }

    @When("I enter the password {string}")
    public void iEnterThePassword(String string) {
        login.iEnterThePassword(string);
    }

    @When("I click the Log in button")
    public void iClickTheLogInButton() {
        login.clickLoginButton();
    }
}
