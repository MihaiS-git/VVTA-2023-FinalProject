package starter.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import starter.pageobjects.ProductsPage;

public class SendMessageSteps extends UIInteractionSteps {

    @Step("I click the Contact button")
    public void iClickTheContactButton() {
        try {
            Thread.sleep(3000);
        } catch (Exception e){
            e.getStackTrace();
        }
        find(ProductsPage.CONTACT_BUTTON).click();
    }

    @Step("I enter Contact Email {string}")
    public void iEnterContactEmail(String string) {
        try {
            Thread.sleep(3000);
        } catch (Exception e){
            e.getStackTrace();
        }
        find(ProductsPage.CONTACT_EMAIL_FIELD).sendKeys(string);
    }

    @Step("I enter Contact Name {string}")
    public void iEnterContactName(String string) {
        find(ProductsPage.CONTACT_NAME_FIELD).sendKeys(string);
    }

    @Step("I enter Message {string}")
    public void iEnterMessage(String string) {
        find(ProductsPage.MESSAGE_FIELD).sendKeys(string);
    }

    @Step("I click Send message button")
    public void iClickSendMessageButton() {
        find(ProductsPage.SEND_MESSAGE_BUTTON).click();
    }
}
