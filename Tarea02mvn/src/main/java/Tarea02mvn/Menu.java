import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Menu {
    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");     

        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.avid.com");
        
        driver.manage().window().setSize(new Dimension(1572, 1026));
        driver.findElement(By.id("siteAlertAccept")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Pro Tools")).click();
        driver.findElement(By.cssSelector("#mp-menu > .logo .ai")).click();
        driver.findElement(By.linkText("Media Composer")).click();
        driver.findElement(By.linkText("Sibelius")).click();
        driver.findElement(By.cssSelector("#mp-menu > .logo .ai")).click();
        driver.findElement(By.linkText("Solutions")).click();
        driver.findElement(By.linkText("Centro de Recursos")).click();
        driver.findElement(By.cssSelector("#mp-menu > .add-communities")).click();
        driver.findElement(By.linkText("Centro de Recursos")).click();
        driver.findElement(By.linkText("Solutions")).click();
        

        Thread.sleep(5000);
        driver.quit();
    }
}
