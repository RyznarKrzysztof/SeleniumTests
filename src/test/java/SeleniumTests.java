import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumTests extends BasicTest{

    int rand = 0;

    @Test
    public void firstTest(){
        driver.get("https://www.google.com");
        WebElement searchInput = driver.findElement(By.cssSelector("input[title='Szukaj']"));
        searchInput.sendKeys("Sherlock Holmes" + Keys.ENTER);
        //driver.quit();
    }


    @Test
    public void fillForm(){
        driver.get("http://toolsqa.com/automation-practice-form/");

        //fill first name
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Sherlock");

        //fill last name
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Holmes");

        //select gender
        WebElement gender = driver.findElement(By.id("sex-0"));
        gender.click();

        //select random radio button
        rand = (int)(Math.random() * 7);
        WebElement yearsOfExp = driver.findElement(By.id("exp-"+rand));
        yearsOfExp.click();

        //fill date
        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("17.10.2018");

        //fill checkboxes
        List<WebElement> chBoxes = driver.findElements(By.name("profession"));
        for (WebElement we : chBoxes){
            rand = (int)(Math.random() * 10);
            if(rand % 2 == 0){
                we.click();
            }
        }

        //upload file
        driver.findElement(By.className("input-file")).sendKeys("C:\\Users\\kryznar\\Desktop\\Movie.json");

        //select from dropdown
        WebElement myDropdown = driver.findElement(By.id("continents"));
        Select dropdown = new Select(myDropdown);
        rand = (int)(Math.random() * 7);
        dropdown.selectByIndex(rand);

        //select from list
        WebElement myList = driver.findElement(By.id("selenium_commands"));
        Select dropdownList = new Select(myList);
        dropdownList.selectByIndex(0);

    }


    @Test
    public void table(){
        driver.get("http://toolsqa.com/automation-practice-table/");







    }





}
