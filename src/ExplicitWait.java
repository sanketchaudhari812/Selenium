import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        //enter username
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd@gmail.com");
        
        //fetch the input box attribute value
        System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value"));
        //get height of input box
        System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getSize().getHeight());

        //get height of input box
        System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getSize().getWidth());
        
        //user explicitwait to check if password feild is visible
        //WebDriverWait E1 = new WebDriverWait(driver,30);
        //E1.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys("abcd");


    }
}
