package starter.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.WebElement;
import starter.pageobjects.Product1Page;
import starter.pageobjects.ProductsPage;

public class AddProductsToCartSteps extends UIInteractionSteps {

    @Step("I click the title of a product")
    public void iClickTheTitleOfAProduct() {
        try {
            Thread.sleep(3000);
        } catch (Exception e){
            e.getStackTrace();
        }
        WebElement product = ProductsPage.PRODUCTS.get(0);
        product.click();
    }


    @Step("I click the Add to cart button")
    public void iClickTheAddToCartButton() {
        find(Product1Page.ADD_TO_CART_BUTTON).click();
    }

}
