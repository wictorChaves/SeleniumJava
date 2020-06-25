package set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Text {
    public static void StartUp(WebDriver driver) throws InterruptedException {
        driver.get("http://testing.todvachev.com/special-elements/text-input-field/");

        WebElement element = driver.findElement(By.name("username"));
        element.sendKeys("Test text");
        Thread.sleep(3000);
        element.clear();
        Thread.sleep(3000);
        driver.quit();
    }
}
