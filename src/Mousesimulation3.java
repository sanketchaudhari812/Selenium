import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Mousesimulation3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://jqueryui.com/droppable/");

        //switching to frames
        driver.switchTo().frame(0);
        System.out.println("switched to frame");
        //dragable web element
        WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));

        //Drad and drop using action class
        Thread.sleep(2000);
        Actions a1 = new Actions(driver);
        a1.dragAndDropBy(drag,100, 60).build().perform();

        //Drag the web element and click and hold using coordinates
        Thread.sleep(2000);
        a1.clickAndHold(drag).dragAndDropBy(drag,100,60).build().perform();
        driver.close();
    }
}
