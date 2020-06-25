package get;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Dropdown {
    public static void StartUp(WebDriver driver)
    {
        driver.get("http://testing.todvachev.com/special-elements/drop-down-menu-test/");

        WebElement dropdown = driver.findElement(By.name("DropDownTest"));

        System.out.println("Current Value: " + dropdown.getAttribute("value"));
        System.out.println("");
        System.out.println("Another values");
        System.out.println("");

        List<WebElement> options = driver.findElements(By.cssSelector("#post-6 > div > p:nth-child(6) > select > option"));
        int count = 0;
        for(WebElement option : options){
            count++;
            System.out.println("Option " + count + " value: " + option.getAttribute("value"));
        }

        driver.quit();
    }
}
