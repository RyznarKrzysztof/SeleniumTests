import javafx.scene.control.Alert;
import org.testng.annotations.Test;
import pages.AlertsPage;
import pages.MainMenu;

public class AlertsTest extends BaseTest {

    @Test
    public void simpleAlert(){

        MainMenu topMenu = new MainMenu(driver);
        AlertsPage alertsPage = new AlertsPage(driver);

        topMenu.clickAlertTestFromDemoSitesDropdown();

        alertsPage.clickSimpleAlertButton()
                  .acceptAlert();

    }

    @Test
    public void confirmAlert(){

        MainMenu topMenu = new MainMenu(driver);
        AlertsPage alertsPage = new AlertsPage(driver);

        topMenu.clickAlertTestFromDemoSitesDropdown();

        alertsPage.clickTextFieldAlertButton()
                  .dismissAlert();

    }

    @Test
    public void textFieldAlert(){

        MainMenu topMenu = new MainMenu(driver);
        AlertsPage alertsPage = new AlertsPage(driver);

        topMenu.clickAlertTestFromDemoSitesDropdown();

        alertsPage.clickTextFieldAlertButton();
//                  .sendTextToAlert("Test text");

    }

}
