package starter.pageobjects;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.demoblaze.com/")
public class LoginForm extends PageObject {

    public static final By LOG_IN_BUTTON = By.id("login2");
    public static final By USERNAME_FIELD = By.id("loginusername");
    public static final By PASSWORD_FIELD = By.id("loginpassword");
    public static final By CONNECT_BUTTON = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");

}
