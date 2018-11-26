import org.testng.annotations.Test;
import pages.MainMenu;
import pages.TablePage;

public class TableTest extends BaseTest{


    @Test
    public void tableTest(){

        MainMenu topMenu = new MainMenu(driver);
        TablePage tablePage = new TablePage(driver);

        topMenu.clickTableTestFromDemoSitesDropdown();

        tablePage.assertTable()
                 .printStructuresHigherThanGivenArgument(600);
    }
}
