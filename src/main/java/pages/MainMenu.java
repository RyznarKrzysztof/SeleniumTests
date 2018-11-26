package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainMenu extends BasePage {

    public MainMenu(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        //metoda initElements odpowiada za inicjalizacje wszystkich elementów oznaczonych przy pomocy @FindBy
    }

    @FindBy(linkText = "HOME")
    private WebElement home;

    @FindBy(linkText = "DEMO SITES")
    private WebElement demoSites;

    @FindBy(css = "li.menu-item-22594 a[data-level='2']")
    private WebElement demoSitesFormPractice;

    @FindBy(css = "li.menu-item-22592 a[data-level='2']")
    private WebElement demoSitesTableTest;

    @FindBy(css = "li.menu-item-23109 a[data-level='2']")
    private WebElement demoSitesAlertTest;

    @FindBy(css = "li.menu-item-23300 a[data-level='2']")
    private WebElement demoSitesIFrameTest;

    @FindBy(css = "li.menu-item-22593 a[data-level='2']")
    private WebElement demoSitesTabsWindows;

    public void clickHome(){
        home.click();
    }

    public MainMenu hoverDemoSites(){
        hoverElement(demoSites);
        return this;
    }

    public void clickFormPracticeFromDemoSitesDropdown(){
        hoverDemoSites();
        waitForElementToBeClickable(demoSitesFormPractice);
        demoSitesFormPractice.click();
    }

    public void clickTableTestFromDemoSitesDropdown(){
        hoverDemoSites();
        waitForElementToBeClickable(demoSitesTableTest);
        demoSitesTableTest.click();
    }

    public void clickAlertTestFromDemoSitesDropdown(){
        hoverDemoSites();
        waitForElementToBeClickable(demoSitesAlertTest);
        demoSitesAlertTest.click();
    }

    public void clickIFrameTestFromDemoSitesDropdown(){
        hoverDemoSites();
        waitForElementToBeClickable(demoSitesIFrameTest);
        demoSitesIFrameTest.click();
    }

    public void clickTabsWindowsFromDemoSitesDropdown(){
        hoverDemoSites();
        waitForElementToBeClickable(demoSitesTabsWindows);
        demoSitesTabsWindows.click();
    }

}
