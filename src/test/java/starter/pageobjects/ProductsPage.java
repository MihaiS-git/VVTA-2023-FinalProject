package starter.pageobjects;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends PageObject {
    public static final By LOG_OUT_BUTTON = By.id("logout2");
    public static final By WELCOME_MESSAGE = By.id("nameofuser");
    public static final List<WebElement> PRODUCTS = Serenity.getDriver().findElements(By.className("hrefch"));
    public static final By CART_BUTTON = By.xpath("/html/body/nav/div[1]/ul/li[4]/a");
    public static final By CONTACT_BUTTON = By.xpath("//div[@id='navbarExample']/ul/li[2]/a[@href='#']");
    public static final By CONTACT_EMAIL_FIELD = By.id("recipient-email");
    public static final By CONTACT_NAME_FIELD = By.id("recipient-name");
    public static final By MESSAGE_FIELD = By.id("message-text");
    public static final By SEND_MESSAGE_BUTTON = By.xpath("/html/body/div[1]/div/div/div[3]/button[2]");

}
