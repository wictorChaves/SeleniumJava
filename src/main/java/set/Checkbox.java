package set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkbox {
    public static void StartUp(WebDriver driver) throws InterruptedException {
        driver.get("http://testing.todvachev.com/special-elements/check-button-test-3/");

        WebElement checkbox = driver.findElement(By.cssSelector("#post-33 > div > p:nth-child(8) > input[type=checkbox]:nth-child(1)"));
        Thread.sleep(1000);
        checkbox.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
