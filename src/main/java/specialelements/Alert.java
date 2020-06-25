package specialelements;

import org.openqa.selenium.WebDriver;

public class Alert {
    public static void StartUp(WebDriver driver) throws InterruptedException {
        driver.get("http://testing.todvachev.com/special-elements/alert-box/");
        org.openqa.selenium.Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(3000);
        driver.quit();
    }
}
