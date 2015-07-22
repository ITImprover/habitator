package system.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Денис on 22.07.2015.
 */
public class LoginPage {
    private WebDriver driver;

    @FindBy(name = "name")
    private WebElement userNameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(css = "input[type=\"submit\"]")
    private WebElement submitButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage setUserNameField(String userName) {
        userNameField.clear();
        userNameField.sendKeys(userName);
        return this;
    }

    public LoginPage setPasswordField(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
        return this;
    }

    public void clickSubmitButton() {
        submitButton.click();
    }
}
