package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage= By.cssSelector("#login_button_container h3");

    public void setUsername (String username) {
        sendValues(usernameField,username);
    }

    public void setPassword (String password) {
        sendValues(passwordField,password);
    }

    public ProductPage clickLoginButton () {
        click(loginButton);
        return new ProductPage();
    }

    public ProductPage logInTheApp (String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }

    public String getErrorMessage() {
        return find(errorMessage).getText();
    }
}
