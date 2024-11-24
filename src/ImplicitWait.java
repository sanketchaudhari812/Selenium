import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("good morning images");

        //Handling auto suggetions
        List<WebElement> Allsuggentions = (List<WebElement>) Collections.singletonList(driver.findElement(By.xpath("//ul[@role='listbox']/li")));
        for (int i=0; i < Allsuggentions.size(); i++)
        {
            String expresult = "good morning images";
            if (Allsuggentions.get(i).getText().equalsIgnoreCase(expresult)) {
                Allsuggentions.get(i).click();
                break;

            }
        }
    }
}
