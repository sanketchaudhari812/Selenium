import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class MouseSimulation1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.flipkart.com/");
        //Thread.sleep(8000);
       //driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();

        //create electronics web element ref
        WebElement electro = driver.findElement(By.xpath("//div[@aria-label='Electronics']"));

//mouse simulations using actions class
        Actions act = new Actions(driver);

        //mouse hover to electronics
        Thread.sleep(2000);
        act.moveToElement(electro).build().perform();


        //keyboard operation
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        WebElement fash= driver.findElement(By.xpath("//div[@aria-label='Fashion']"));
        Thread.sleep(2000);
        act.sendKeys(fash, Keys.ENTER).build().perform();
        System.out.println("fashoin option is clicked");

        //rght click on webpage
        Thread.sleep(2000);
        act.contextClick().build().perform();

    }
}
