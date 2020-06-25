package get;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Text {
    public static void StartUp(WebDriver driver)
    {
        driver.get("http://testing.todorvachev.com/selectors/class-name/");

        WebElement element = driver.findElement(By.className("testClass"));
        System.out.println(element.getText());
        driver.quit();
    }
}
