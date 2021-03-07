import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Email {
    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");     

        WebDriver driver = new ChromeDriver();
        
        driver.get("https://connect.avid.com/Email-Preferences-Center.html");
        
        driver.manage().window().setSize(new Dimension(1572, 1026));
        Thread.sleep(2000);

        driver.findElement(By.id("Email")).click();
        driver.findElement(By.id("Email")).sendKeys("infoDAM@gmail.com");
        driver.findElement(By.id("outerWrapDiv")).click();
        driver.findElement(By.id("LblmktoCheckbox_78308_0")).click();
        driver.findElement(By.id("LblmktoCheckbox_78314_0")).click();
        driver.findElement(By.id("LblmktoCheckbox_78310_0")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Areas of Interest")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("LblmktoCheckbox_78318_2")).click();
        driver.findElement(By.id("LblmktoCheckbox_78318_8")).click();
        driver.findElement(By.id("LblmktoCheckbox_78318_9")).click();
        driver.findElement(By.linkText("Communication Types")).click();
        driver.findElement(By.id("mktoCheckbox_75637_9")).sendKeys(Keys.TAB);
        driver.findElement(By.id("mktoCheckbox_75637_9")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div/div/div[3]/div/span/form/div[4]/span/button")).click();

        Thread.sleep(5000);
        driver.quit();
      }

    
}
