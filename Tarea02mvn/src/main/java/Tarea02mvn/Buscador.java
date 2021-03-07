import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buscador {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");     

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.avid.com/");
        Thread.sleep(1000);

        driver.manage().window().setSize(new Dimension(1572, 1026));
        driver.findElement(By.id("siteAlertAccept")).click();

        driver.findElement(By.id("subnav-search-field")).click();
        driver.findElement(By.id("subnav-search-field")).sendKeys("Media Composer");
        driver.findElement(By.id("subnav-search-field")).sendKeys(Keys.ENTER);
        

        Thread.sleep(5000);
        driver.quit();
    }
}
