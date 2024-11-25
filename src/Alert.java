import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Alert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/alerts");

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,400)");


        //Alert handling
        Thread.sleep(2000);
        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(2000);

        //Verify alert text
        //String Alerttext = "Do you confirm action?";
        //Assert.assertequals

        //Accpet the alert
        driver.switchTo().alert().accept();
        System.out.println("alert accepted");

        //dismiss the alert
        driver.findElement(By.id("confirmButton")).click();
        driver.switchTo().alert().dismiss();
        System.out.println("alert dismissed");



    }
}
