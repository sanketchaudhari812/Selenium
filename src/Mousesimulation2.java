import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Mousesimulation2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://jqueryui.com/droppable/");

        //switching to frames
        driver.switchTo().frame(0);
        System.out.println("switched to frame");

        //dragable web element
        WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));

        //dropable web element
        WebElement drop = driver.findElement(By.id("droppable"));

        //Drad and drop using action class
        Actions a1 = new Actions(driver);
        a1.dragAndDrop(drag,drop).build().perform();
        driver.close();



    }
}
