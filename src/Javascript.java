import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        //Locate webelement using javascript
        jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
        jse.executeScript("document.getElementById('pass').value='pass'");

        //scrolldown using javascript
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,400)");

        //scrollup javascript
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,-400)");




    }
}
