package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.actions.AddProductsToCartSteps;
import starter.actions.LoginSteps;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AddProductsToCartStepDefinitions {
    @Steps
    AddProductsToCartSteps addToCart;

    @Steps
    LoginSteps login;

    @When("I click the title of a product")
    public void iClickTheTitleOfAProduct() {
        addToCart.iClickTheTitleOfAProduct();
    }

    @When("I click the Add to cart button")
    public void iClickTheAddToCartButton() {
        addToCart.iClickTheAddToCartButton();
    }

    @Then("I should see the {string} message")
    public void iShouldSeeTheMessage(String string) {
        assertThat(login.getAlertMessage().contains(string));
    }
}


