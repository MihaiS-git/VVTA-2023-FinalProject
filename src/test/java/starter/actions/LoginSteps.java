package starter.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractionSteps;
import starter.pageobjects.LoginForm;
import starter.pageobjects.ProductsPage;


public class LoginSteps extends UIInteractionSteps {

    @Step("I go on the login page")
    public void getLoginPage(){
        find(LoginForm.LOG_IN_BUTTON).click();
    }

    @Step("I enter the username {string}")
    public void iEnterTheUsername(String string) {
        find(LoginForm.USERNAME_FIELD).sendKeys(string);
    }

    @Step("I enter the password {string}")
    public void iEnterThePassword(String string) {
        find(LoginForm.PASSWORD_FIELD).sendKeys(string);
    }

    @Step("I click the Log in button")
    public void clickLoginButton(){
        find(LoginForm.CONNECT_BUTTON).click();
    }

    @Step("I should see the alert message containing the text {string}")
    public String getAlertMessage() {
        try {
            Thread.sleep(3000);
        } catch (Exception e){
            e.getStackTrace();
        }
        return Serenity.getDriver().switchTo().alert().getText();
    }

    @Step("I get the {string} welcome message")
    public String getTheWelcomeNameMessage() {
        try {
            Thread.sleep(3000);
        } catch (Exception e){
            e.getStackTrace();
        }
        return find(ProductsPage.WELCOME_MESSAGE).getText();
    }
}
