package pages;

import com.google.common.collect.Table;
import javafx.scene.control.Tab;
import models.Building;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TablePage extends BasePage{

    public TablePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "tbody tr")
    private List<WebElement> tableRows;

    @FindBy(css = "tbody th")
    private List<WebElement> structrureNames;

    @FindBy(css = "tbody td")
    private List<WebElement> structrureDetails;

    public List<Building> createListOfBuildingsFromTable(List<WebElement> tableRows){

        List<Building> buildings = new ArrayList<Building>();
        List<String> tmpList = new ArrayList<String>();

        for (WebElement we : tableRows){

            tmpList.add(we.findElement(By.cssSelector("th")).getText());
            for(int i = 0; i < 5; i++){
                tmpList.add(we.findElements(By.cssSelector("td")).get(i).getText());
            }
            buildings.add(new Building(tmpList.get(0),
                    tmpList.get(1),
                    tmpList.get(2),
                    tmpList.get(3),
                    tmpList.get(4),
                    tmpList.get(5)));
            tmpList.clear();
        }
        return buildings;
    }

    public TablePage assertTable(){
        List<Building> buildings = createListOfBuildingsFromTable(tableRows);

        for(int i = 0; i < buildings.size(); i++){
            Assert.assertEquals(buildings.get(i).getName(), structrureNames.get(i).getText());
        }
        return this;
    }

    public TablePage printStructuresHigherThanGivenArgument(int height){
        List<Building> buildings = createListOfBuildingsFromTable(tableRows);
        for(Building building : buildings){
            if(Integer.parseInt(building.getHeight().substring(0,3)) > height){
                System.out.println(building.toString());
            }
        }
        return this;

    }



}
