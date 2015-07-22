package system.pageobjects;

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

    public WebElement getUserNameField() {
        return userNameField;
    }

    public void setUserNameField(WebElement userNameField) {
        this.userNameField = userNameField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(WebElement passwordField) {
        this.passwordField = passwordField;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public void setSubmitButton(WebElement submitButton) {
        this.submitButton = submitButton;
    }
}
