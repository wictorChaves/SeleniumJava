package get;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioButton {
    public static void StartUp(WebDriver driver) {
        driver.get("http://testing.todvachev.com/special-elements/radio-button-test/");

        List<WebElement> radios = driver.findElements(By.cssSelector("#post-10 > div > form > p:nth-child(6) > input[type=radio]"));

        int count = 0;
        for (WebElement radio : radios) {
            count++;
            System.out.println("Checkbox " + count);
            System.out.println("Checked: " + attributeIsChecked(radio.getAttribute("checked")));
            System.out.println("Value: " + radio.getAttribute("value"));
            System.out.println("");
        }

        driver.quit();
    }

    private static String attributeIsChecked(String attribute) {
        if (attribute == null) {
            return "false";
        }
        return attribute.equals("true") ? "true" : "false";
    }
}
