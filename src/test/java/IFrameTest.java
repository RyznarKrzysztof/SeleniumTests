import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.FormPage;
import pages.IFramePage;
import pages.MainMenu;

public class IFrameTest extends BaseTest{


    @Test
    public void iFramePageTest(){
        MainMenu topMenu = new MainMenu(driver);
        IFramePage iFramePage = new IFramePage(driver);
        FormPage formPageInFrame1 = new FormPage(driver);

        topMenu.clickIFrameTestFromDemoSitesDropdown();

        iFramePage.switchToFrame1();
        formPageInFrame1.clickSubmitButton();
        iFramePage.leaveCurrentFrame()
                  .switchToFrame2();
        driver.findElement(By.cssSelector("p[class='visible-xs'] a")).click();
        iFramePage.leaveCurrentFrame();
        topMenu.clickHome();
    }






}
