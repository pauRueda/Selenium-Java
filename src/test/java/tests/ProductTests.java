package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTests extends BaseTest {


    @Test
    public void testsProductsHeaderIsDisplayed () {
        var productsPage = loginPage.logInTheApp(
                "standard_user","secret_sauce");

        Assert.assertTrue(productsPage.isProductHeaderDisplayed());
    }

}
