import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Aug");

//2nd way
        WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
        Select month = new Select(bm);
        Thread.sleep(2000);
        month.selectByVisibleText("Apr");
        Thread.sleep(2000);
        month.selectByValue("3");
        Thread.sleep(2000);
        month.selectByIndex(7);
        System.out.println(month.getFirstSelectedOption().getText());
        driver.close();


        //check if dropdown supports multi selection
        System.out.println(month.isMultiple());
    }
}
