package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.List;

public class FormPage extends BasePage{

    Select dropdown;

    public FormPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        //metoda initElements odpowiada za inicjalizacje wszystkich elementów oznaczonych przy pomocy @FindBy
    }

    @FindBy(name = "firstname")
    private WebElement firstname;

    @FindBy(name = "lastname")
    private WebElement lastname;

    @FindBy(name = "sex")
    private List<WebElement> genders;

    @FindBy(name = "exp")
    private List<WebElement> yearsOfExp;

    @FindBy(id = "datepicker")
    private WebElement datePicker;

    @FindBy(css = "[name=\"profession\"]")
    private List<WebElement> professions;

    @FindBy(id = "photo")
    private WebElement fileInput;

    @FindBy(name = "tool")
    private List<WebElement> automationTools;

    @FindBy(id = "continents")
    private WebElement continentFromDropdown;

    @FindBy(css = "select[id='selenium_commands'] option")
    private List<WebElement> seleniumCommands;

    @FindBy(id = "submit")
    private WebElement submitButton;

    public FormPage fillFirstname(String firstName){
        waitForElementToBeVisible(firstname);
        waitForElementToBeClickable(firstname);
        firstname.sendKeys(firstName);
        return this;
    }

    public FormPage fillLasttname(String lastName){
        waitForElementToBeClickable(lastname);
        lastname.sendKeys(lastName);
        return this;
    }

    public FormPage selectGender(String gender){
        for(WebElement we : genders){
            if (we.getAttribute("value").equalsIgnoreCase(gender)){
                we.click();
            }
        }
        return this;
    }

    public FormPage selectYearsOfExp(int years){
        for(WebElement we : yearsOfExp){
            if (Integer.parseInt(we.getAttribute("value")) == years){
                we.click();
            }
        }
        return this;
    }

    public FormPage fillDate(String date){
        datePicker.sendKeys(date);
        return this;
    }

    public FormPage selectProfession(String profession){
        for(WebElement we : professions){
            if (we.getAttribute("value").equalsIgnoreCase(profession)){
                we.click();
            }
        }
        return this;
    }

    public FormPage selectFile(String filePath){

        //fileInput.sendKeys(filePath);
        return this;
    }

    public FormPage selectAutomationTools(String tool){
        for(WebElement we : automationTools){
            if (we.getAttribute("value").equalsIgnoreCase(tool)){
                we.click();
            }
        }
        return this;
    }

    public FormPage selectContinent(String continent){
        dropdown = new Select(continentFromDropdown);
        dropdown.selectByVisibleText(continent);
        return this;
    }

    public FormPage selectSeleniumCommands(){
        return this;
    }

    public FormPage selectRandomSeleniumCommands() {

        action.keyDown(Keys.CONTROL).perform();
        for(WebElement seleniumCommand : seleniumCommands){
            if(rand.nextInt(10) % 2 == 0){
                seleniumCommand.click();
            }
        }
        return this;
    }

    public FormPage clickSubmitButton(){
        submitButton.click();
        return this;
    }

}
