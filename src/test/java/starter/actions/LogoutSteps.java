package starter.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import starter.pageobjects.LoginForm;
import starter.pageobjects.ProductsPage;

public class LogoutSteps extends UIInteractionSteps {


    @Step("I click the Log out button")
    public void iClickTheLogOutButton() {
        try {
            Thread.sleep(3000);
        } catch (Exception e){
            e.getStackTrace();
        }
        find(ProductsPage.LOG_OUT_BUTTON).click();
    }


    @Step("I should find the Login button on the page")
    public String iShouldFindTheLoginButtonOnThePage() {
        try {
            Thread.sleep(3000);
        } catch (Exception e){
            e.getStackTrace();
        }
        return LoginForm.LOG_IN_BUTTON.toString();
    }
}
