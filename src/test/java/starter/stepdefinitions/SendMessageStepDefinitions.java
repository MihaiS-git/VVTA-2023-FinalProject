package starter.stepdefinitions;

import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.actions.SendMessageSteps;

public class SendMessageStepDefinitions {

    @Steps
    SendMessageSteps message;

    @When("I click the Contact button")
    public void iClickTheContactButton() {
        message.iClickTheContactButton();
    }

    @When("I enter Contact Email {string}")
    public void iEnterContactEmail(String string) {
        message.iEnterContactEmail(string);
    }

    @When("I enter Contact Name {string}")
    public void iEnterContactName(String string) {
        message.iEnterContactName(string);
    }

    @When("I enter Message {string}")
    public void iEnterMessage(String string) {
        message.iEnterMessage(string);
    }

    @When("I click Send message button")
    public void iClickSendMessageButton() {
        message.iClickSendMessageButton();
    }
}
