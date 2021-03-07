import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RSS {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");    

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.avid.com/rss-feeds");
        Thread.sleep(3000);
        driver.findElement(By.id("siteAlertAccept")).click();
        
        // Abrimos elementos de RSS
        
        driver.findElement(By.linkText("Avid Customer Stories")).click();
        Thread.sleep(2000); 
        driver.findElement(By.linkText("Avid Press Releases")).click();
        Thread.sleep(2000); 
        driver.findElement(By.cssSelector("h2:nth-child(1)")).click();
        Thread.sleep(2000); 
        driver.findElement(By.linkText("Avid Blogs")).click();
        Thread.sleep(2000); 
        driver.findElement(By.linkText("Avid Community Tutorials")).click();
        Thread.sleep(2000); 
        driver.findElement(By.linkText("Avid Community Tips")).click();
        Thread.sleep(2000); 
        driver.findElement(By.linkText("Avid Knowledge Base Articles")).click();
        Thread.sleep(2000);

        Thread.sleep(5000);

    }
}