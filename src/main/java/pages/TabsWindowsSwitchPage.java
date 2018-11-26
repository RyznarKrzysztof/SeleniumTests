package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TabsWindowsSwitchPage extends BasePage {

    public TabsWindowsSwitchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "button[id='button1']")
    private WebElement newBrowserWindowButton;

    @FindBy(css = "button[onclick='newMsgWin()']")
    private WebElement newMessageWindowButton;

    @FindBy(css = "button[onclick='newBrwTab()']")
    private WebElement newBrowserTabButton;

    @FindBy(css = "button[id='alert']")
    private WebElement alertButton;


    public TabsWindowsSwitchPage clickNewBrowserWindowButton() {
        waitForElementToBeClickable(newBrowserWindowButton);
        newBrowserWindowButton.click();
        return this;
    }

    public TabsWindowsSwitchPage clickNewMessageWindowButton() {
        waitForElementToBeClickable(newMessageWindowButton);
        newMessageWindowButton.click();
        return this;
    }

    public TabsWindowsSwitchPage clickNewBrowserTabButton() {
        waitForElementToBeClickable(newBrowserTabButton);
        newBrowserTabButton.click();
        return this;
    }

    public TabsWindowsSwitchPage clickAlertButton() {
        waitForElementToBeClickable(alertButton);
        alertButton.click();
        return this;
    }

}
