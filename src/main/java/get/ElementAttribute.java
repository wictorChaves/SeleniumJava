package get;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementAttribute {
    public static void StartUp(WebDriver driver)
    {
        driver.get("http://testing.todvachev.com/special-elements/radio-button-test/");

        WebElement element = driver.findElement(By.cssSelector(".entry-thumbnail > img"));
        System.out.println(element.getAttribute("src"));
        driver.quit();
    }
}
