import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collections;
import java.util.List;

public class Radiobutton {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button')]")).click();

        //1st way
        driver.findElement(By.xpath("//input[@value='1']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='2']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='-1']")).click();


    }
}
