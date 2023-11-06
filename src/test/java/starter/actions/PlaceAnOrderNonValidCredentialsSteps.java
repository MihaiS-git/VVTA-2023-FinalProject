package starter.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractionSteps;
import starter.pageobjects.CartPage;

public class PlaceAnOrderNonValidCredentialsSteps extends UIInteractionSteps {

    @Step("I accept the alert")
    public void iAcceptTheAlert() {
        Serenity.getDriver().switchTo().alert().accept();
    }

    @Step("I close the form")
    public void iCloseTheForm() {
        find(CartPage.FORM_X_BUTTON).click();
    }

}
