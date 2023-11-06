package starter.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractionSteps;
import starter.pageobjects.LoginForm;

public class LoginNavigateSteps extends UIInteractionSteps {
    LoginForm loginForm;

    @Step("User opens the DemoBlaze Products Page")
    public void opensTheHomePage() {
        loginForm.open();
        Serenity.getDriver().manage().window().maximize();
        try {
            Thread.sleep(3000);
        } catch (Exception e){
            e.getStackTrace();
        }
    }
}
