import org.testng.annotations.Test;
import pages.FormPage;
import pages.MainMenu;

public class FormTest extends BaseTest {

    @Test
    public void fillForm() {

        MainMenu topMenu = new MainMenu(driver);
        FormPage formPage = new FormPage(driver);

        topMenu.clickFormPracticeFromDemoSitesDropdown();

        formPage.fillFirstname("Sherlock")
                .fillLasttname("Holmes")
                .selectGender("Male")
                .selectYearsOfExp(7)
                .fillDate("01.01.01")
                .selectProfession("Automation tester")
                //.selectFile("src\\test\\resources\\Sherlock Holmes.jpg")
                .selectAutomationTools("QTP")
                .selectContinent("Europe")
                .selectRandomSeleniumCommands()
                .clickSubmitButton();





    }

}
