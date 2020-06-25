package elementselectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XPath {
    public static void StartUp(WebDriver driver) {
        driver.get("http://testing.todorvachev.com/selectors/xpath/");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"post-109\"]/div/figure/img"));
        if (element.isDisplayed()) {
            System.out.println("Yes! I can see the element, it´s right there!!!");
        } else {
            System.out.println("Well, something went wrong, I couldn't see the element!");
        }
        driver.quit();
    }
}
