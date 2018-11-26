package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IFramePage extends BasePage{

    public IFramePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        //metoda initElements odpowiada za inicjalizacje wszystkich elementów oznaczonych przy pomocy @FindBy
    }

    @FindBy(id = "IF1")
    private WebElement frame1;

    @FindBy(id = "IF2")
    private WebElement frame2;

    public IFramePage switchToFrame1(){
        driver.switchTo().frame(frame1);
        return this;
    }

    public IFramePage switchToFrame2(){
        driver.switchTo().frame(frame2);
        return this;
    }

    public IFramePage leaveCurrentFrame(){
        driver.switchTo().defaultContent();
        return this;
    }




}
