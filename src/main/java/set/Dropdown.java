package set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dropdown {
    public static void StartUp(WebDriver driver) throws InterruptedException {
        driver.get("http://testing.todvachev.com/special-elements/drop-down-menu-test/");

        WebElement option   = driver.findElement(By.cssSelector("#post-6 > div > p:nth-child(6) > select > option:nth-child(3)"));
        Thread.sleep(2000);
        option.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
