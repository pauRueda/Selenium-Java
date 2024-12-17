package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginErrorMessage () {
        loginPage.setUsername("standard_user");
        loginPage.setPassword("dawd542");
        loginPage.clickLoginButton();
        String messageRecieved = loginPage.getErrorMessage();
        Assert.assertTrue(messageRecieved.contains("Epic sadface"));
    }
}
