package starter.pageobjects;

import org.openqa.selenium.By;

public class CartPage {
    public static final By PLACE_ORDER_BUTTON = By.xpath("/html/body/div[6]/div/div[2]/button");
    public static final By NAME_FIELD = By.id("name");
    public static final By COUNTRY_FIELD = By.id("country");
    public static final By CITY_FIELD = By.id("city");
    public static final By CARD_FIELD = By.id("card");
    public static final By MONTH_FIELD = By.id("month");
    public static final By YEAR_FIELD = By.id("year");
    public static final By PURCHASE_BUTTON = By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");
    public static final By SUCCESS_MESSAGE = By.xpath("/html/body/div[10]/h2");
    public static final By OK_BUTTON = By.xpath("/html/body/div[10]/div[7]/div/button");
    public static final By FORM_X_BUTTON = By.xpath("/html/body/div[3]/div/div/div[1]/button/span");

}
