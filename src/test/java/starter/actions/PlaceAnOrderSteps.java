package starter.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import starter.pageobjects.CartPage;
import starter.pageobjects.ProductsPage;

public class PlaceAnOrderSteps extends UIInteractionSteps {

    @Step("I click the Cart button")
    public void iClickTheCartButton() {
        try {
            Thread.sleep(3000);
        } catch (Exception e){
            e.getStackTrace();
        }

        find(ProductsPage.CART_BUTTON).click();

        try {
            Thread.sleep(3000);
        } catch (Exception e){
            e.getStackTrace();
        }
    }

    @Step("I click the Place Order button")
    public void iClickThePlaceOrderButton() {
        find(CartPage.PLACE_ORDER_BUTTON).click();
        try {
            Thread.sleep(3000);
        } catch (Exception e){
            e.getStackTrace();
        }
    }

    @Step("I enter the Name {string}")
    public void iEnterTheName(String string) {
        find(CartPage.NAME_FIELD).sendKeys(string);
    }

    @Step("I enter the Country {string}")
    public void iEnterTheCountry(String string) {
        find(CartPage.COUNTRY_FIELD).sendKeys(string);
    }

    @Step("I enter the City {string}")
    public void iEnterTheCity(String string) {
        find(CartPage.CITY_FIELD).sendKeys(string);
    }

    @Step("I enter the Credit Card {string}")
    public void iEnterTheCreditCard(String string) {
        find(CartPage.CARD_FIELD).sendKeys(string);
    }

    @Step("I enter the Month {string}")
    public void iEnterTheMonth(String string) {
        find(CartPage.MONTH_FIELD).sendKeys(string);
    }

    @Step("I enter the year {string}")
    public void iEnterTheYear(String string) {
        find(CartPage.YEAR_FIELD).sendKeys(string);
    }

    @Step("I click Purchase button")
    public void iClickPurchaseButton() {
        find(CartPage.PURCHASE_BUTTON).click();
    }

    @Step("I get the {string} success message")
    public String getTheSuccessMessage() {
        try {
            Thread.sleep(3000);
        } catch (Exception e){
            e.getStackTrace();
        }
        return find(CartPage.SUCCESS_MESSAGE).getText();
    }

    @Step("I click Ok button")
    public void iClickOkButton() {
        find(CartPage.OK_BUTTON).click();
    }
}
