package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AlertsPage extends BasePage {

    Alert alert;

    public AlertsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "button[onclick='pushAlert()']")
    private WebElement simpleAlert;

    @FindBy(css = "button[onclick='pushConfirm()']")
    private WebElement confirmAlert;

    @FindBy(css = "button[onclick='promptConfirm()']")
    private WebElement textFieldAlert;


    public AlertsPage clickSimpleAlertButton() {
        waitForElementToBeClickable(simpleAlert);
        simpleAlert.click();
        return this;
    }

    public AlertsPage clickConfirmAlertButton() {
        waitForElementToBeClickable(confirmAlert);
        confirmAlert.click();
        return this;
    }

    public AlertsPage clickTextFieldAlertButton() {
        waitForElementToBeClickable(textFieldAlert);
        textFieldAlert.click();
        return this;
    }

    public AlertsPage switchToAlert() {
        wait.until(ExpectedConditions.alertIsPresent());
        alert = driver.switchTo().alert();
        return this;

    }

    public void acceptAlert() {
        wait.until(ExpectedConditions.alertIsPresent());
        alert = driver.switchTo().alert();
        alert.accept();
    }

    public void dismissAlert() {
        wait.until(ExpectedConditions.alertIsPresent());
        alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void sendTextToAlert(String argForAlert) {
        wait.until(ExpectedConditions.alertIsPresent());
        alert = driver.switchTo().alert();
        alert.sendKeys(argForAlert);
    }
}
