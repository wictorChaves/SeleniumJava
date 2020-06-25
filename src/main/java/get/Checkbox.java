package get;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkbox {
    public static void StartUp(WebDriver driver) {
        driver.get("http://testing.todvachev.com/special-elements/check-button-test-3/");

        WebElement checkbox1 = driver.findElement(By.cssSelector("#post-33 > div > p:nth-child(8) > input[type=checkbox]:nth-child(1)"));
        WebElement checkbox2 = driver.findElement(By.cssSelector("#post-33 > div > p:nth-child(8) > input[type=checkbox]:nth-child(3)"));

        System.out.println("Checkbox 1");
        System.out.println("Checked: " + attributeIsChecked(checkbox1.getAttribute("checked")));
        System.out.println("Value: " + checkbox1.getAttribute("value"));
        System.out.println("");

        System.out.println("Checkbox 2");
        System.out.println("Checked: " + attributeIsChecked(checkbox2.getAttribute("checked")));
        System.out.println("Value: " + checkbox2.getAttribute("value"));
        System.out.println("");

        driver.quit();
    }

    private static String attributeIsChecked(String attribute) {
        if (attribute == null) {
            return "false";
        }
        return attribute.equals("true") ? "true" : "false";
    }
}
