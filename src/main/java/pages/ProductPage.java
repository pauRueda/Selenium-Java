package pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage{

    private By productsHeader = By.xpath("//span[text()='Products']");

    public boolean isProductHeaderDisplayed () {
        return find(productsHeader).isDisplayed();
    }
}
