import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Formulario {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");       

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.avid.com/");
        Thread.sleep(1000);
        
        driver.manage().window().setSize(new Dimension(1572, 1026));
        driver.findElement(By.id("siteAlertAccept")).click();

        driver.findElement(By.cssSelector(".contacts-container > a:nth-child(1) > span")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("FirstName")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Loli");
        driver.findElement(By.id("LastName")).click();
        driver.findElement(By.id("LastName")).sendKeys("Iglesias");
        driver.findElement(By.id("Title")).sendKeys("DAM");
        driver.findElement(By.id("Company")).sendKeys("DAM Enterprise");
        driver.findElement(By.id("Email")).sendKeys("DAM@gmail.com");
        driver.findElement(By.id("Phone")).sendKeys("600000000");
        driver.findElement(By.id("City")).sendKeys("Santiago de Compostela");
        driver.findElement(By.cssSelector("#Contact-sales-form > .main-content-column")).click();
        driver.findElement(By.id("Country")).click();
  
        WebElement dropdown = driver.findElement(By.id("Country"));
        dropdown.findElement(By.xpath("//option[. = 'España']")).click();
  
        driver.findElement(By.id("Country")).click();
        driver.findElement(By.id("PostalCode")).click();
        driver.findElement(By.id("PostalCode")).sendKeys("15707");
        driver.findElement(By.cssSelector("#Contact-sales-form > .main-content-column")).click();
        driver.findElement(By.id("Describe_Yourself__c")).click();
    
        WebElement dropdown2 = driver.findElement(By.id("Describe_Yourself__c"));
        dropdown2.findElement(By.xpath("//option[. = 'Artista']")).click();

        driver.findElement(By.id("Describe_Yourself__c")).click();
        driver.findElement(By.id("mktoCheckbox_75637_0")).click();
        driver.findElement(By.id("mktoCheckbox_75637_3")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".mktoButton")).click();


/*         driver.findElement(By.id("mktoCheckbox_75637_3")).sendKeys(Keys.TAB);
        driver.findElement(By.id("mktoCheckbox_75637_3")).sendKeys(Keys.TAB);
        driver.findElement(By.id("mktoCheckbox_75637_3")).sendKeys(Keys.TAB);
        driver.findElement(By.id("mktoCheckbox_75637_3")).sendKeys(Keys.TAB);
        driver.findElement(By.id("mktoCheckbox_75637_3")).sendKeys(Keys.TAB);
        driver.findElement(By.id("mktoCheckbox_75637_3")).sendKeys(Keys.TAB);
        driver.findElement(By.id("mktoCheckbox_75637_3")).sendKeys(Keys.TAB);
        driver.findElement(By.id("mktoCheckbox_75637_3")).sendKeys(Keys.TAB);
        driver.findElement(By.id("mktoCheckbox_75637_3")).sendKeys(Keys.TAB);
        driver.findElement(By.id("mktoCheckbox_75637_3")).sendKeys(Keys.TAB);
        driver.findElement(By.id("mktoCheckbox_75637_3")).sendKeys(Keys.TAB);
        driver.findElement(By.id("mktoCheckbox_75637_3")).sendKeys(Keys.TAB);
        driver.findElement(By.id("mktoCheckbox_75637_3")).sendKeys(Keys.ENTER); */



        Thread.sleep(5000);
        driver.quit();

    }
}
