import org.openqa.selenium.WebDriver;
import specialelements.Alert;

public class SeleniumMan {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\wictor\\Documents\\Wictor\\Workspace\\Github\\SeleniumJava\\chromedriver.exe");
        WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();

        Alert.StartUp(driver);
    }
}
