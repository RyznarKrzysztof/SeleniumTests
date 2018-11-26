import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.MainMenu;
import pages.TabsWindowsSwitchPage;

import java.util.ArrayList;
import java.util.List;

public class TabsWindowsTest extends BaseTest {


    @Test
    public void newBrowserWindowTest() {

        MainMenu topMenu = new MainMenu(driver);
        TabsWindowsSwitchPage tabWindowSwitchPage = new TabsWindowsSwitchPage(driver);

        topMenu.clickTabsWindowsFromDemoSitesDropdown();

        String winHandleBefore = driver.getWindowHandle(); // Store the current window handle
        tabWindowSwitchPage.clickNewBrowserWindowButton(); // Perform the click operation that opens new window

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);           // Switch to new window opened
        }

        driver.findElement(By.cssSelector("a.dt-mobile-menu-icon span")).click();
        driver.close();                                    // Close the new window, if that window no more required
        driver.switchTo().window(winHandleBefore);         // Switch back to original browser (first window)

        tabWindowSwitchPage.clickAlertButton();

    }

    @Test
    public void newMessageWindowTest() {

        MainMenu topMenu = new MainMenu(driver);
        TabsWindowsSwitchPage tabWindowSwitchPage = new TabsWindowsSwitchPage(driver);

        topMenu.clickTabsWindowsFromDemoSitesDropdown();

        String winHandleBefore = driver.getWindowHandle(); // Store the current window handle
        tabWindowSwitchPage.clickNewMessageWindowButton(); // Perform the click operation that opens new window

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);           // Switch to new window opened
        }

        System.out.println(driver.findElement(By.cssSelector("body")).getText());
        driver.close();                                    // Close the new window, if that window no more required
        driver.switchTo().window(winHandleBefore);         // Switch back to original browser (first window)

        tabWindowSwitchPage.clickAlertButton();

    }

    @Test
    public void newTabTest() {

        MainMenu topMenu = new MainMenu(driver);
        TabsWindowsSwitchPage tabWindowSwitchPage = new TabsWindowsSwitchPage(driver);

        topMenu.clickTabsWindowsFromDemoSitesDropdown();

        String parentTab = driver.getWindowHandle();       // Store Parent Tab
        tabWindowSwitchPage.clickNewBrowserTabButton();    // Perform the click operation that opens new window

        List<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(parentTab);

        driver.switchTo().window(newTab.get(0));        // change focus to new tab
        topMenu.clickTabsWindowsFromDemoSitesDropdown();// Do what you want here, you are in the new tab
        driver.close();

        driver.switchTo().window(parentTab);            // change focus back to old tab
        tabWindowSwitchPage.clickAlertButton();

    }

}
