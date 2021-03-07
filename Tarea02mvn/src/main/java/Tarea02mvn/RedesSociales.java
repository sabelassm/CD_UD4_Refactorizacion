import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedesSociales {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");     

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.avid.com/");
        Thread.sleep(3000);

        // Abrimos RSS
        driver.findElement(By.id("siteAlertAccept")).click();
        driver.findElement(By.cssSelector(".fa-rss")).click(); 
        Thread.sleep(1000); 

        // Abrimos Youtube
        driver.findElement(By.cssSelector(".fa-youtube")).click();
        Thread.sleep(2000); 

        // Abrimos Facebook
        driver.findElement(By.cssSelector(".fa-facebook-f")).click();
        Thread.sleep(2000); 

        // Abrimos Twitter
        driver.findElement(By.cssSelector(".fa-twitter")).click();
        Thread.sleep(2000); 

        // Abrimos Linkedin
        driver.findElement(By.cssSelector(".fa-linkedin")).click();
        Thread.sleep(2000); 

        // Abrimos Instagram
        driver.findElement(By.cssSelector(".ai-instagram")).click();
        Thread.sleep(2000); 

        // Abrimos Snapchat
        driver.findElement(By.cssSelector(".ai-snapchat-ghost")).click();
        Thread.sleep(2000); 

        Thread.sleep(5000);
        driver.quit();

    }
}
