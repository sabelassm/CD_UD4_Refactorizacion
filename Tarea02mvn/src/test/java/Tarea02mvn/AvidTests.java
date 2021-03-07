import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Probas sobre a páxina web www.avid.com
 * @author Dolores Iglesias
 * @version para mac e adaptada a un proxecto maven
*/

public class AvidTests {
    private WebDriver driver;

    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "/Users/Loliz2/Desktop/CONTORNOS/Tarea02mvn/driver/chromedriver");    

        driver = new ChromeDriver();
    }

    /**
     * Facemos unha búsqueda na páxina web. Comprobamos que o resultado é o esperado.
     * @return equals
     */
    @Test
    public void realizarBusqueda() {

        driver.get("https://www.avid.com/");

        driver.manage().window().setSize(new Dimension(1572, 1026));
        driver.findElement(By.id("siteAlertAccept")).click();

        driver.findElement(By.id("subnav-search-field")).click();
        driver.findElement(By.id("subnav-search-field")).sendKeys("Media Composer");
        driver.findElement(By.id("subnav-search-field")).sendKeys(Keys.ENTER);

        String Titulo="Search | Avid";
        String Search=driver.getTitle();
        assertEquals(Titulo,Search);

    }

    /**
     * Cubrimos o formulario de preferencias de suscripción. Comprobamos que se enviou correctamente.
     * @return equals
     */
    @Test
    public void Email() {

        driver.get("https://connect.avid.com/Email-Preferences-Center.html");
        
        driver.manage().window().setSize(new Dimension(1572, 1026));
        driver.findElement(By.id("Email")).click();
        driver.findElement(By.id("Email")).sendKeys("infoDAM@gmail.com");
        driver.findElement(By.id("outerWrapDiv")).click();
        driver.findElement(By.id("LblmktoCheckbox_78308_0")).click();
        driver.findElement(By.id("LblmktoCheckbox_78314_0")).click();
        driver.findElement(By.id("LblmktoCheckbox_78310_0")).click();
        driver.findElement(By.linkText("Areas of Interest")).click();
        driver.findElement(By.id("LblmktoCheckbox_78318_2")).click();
        driver.findElement(By.id("LblmktoCheckbox_78318_8")).click();
        driver.findElement(By.id("LblmktoCheckbox_78318_9")).click();
        driver.findElement(By.linkText("Communication Types")).click();
        driver.findElement(By.cssSelector(".mktoButton")).click();
       
        String Envio="Your email address infoDAM@gmail.com has been updated.";
        WebElement Confirmacion = driver.findElement(By.id("bodyId"));
        String Actualizacion=Confirmacion.getText();
        assertEquals(Envio,Actualizacion);

    }

    /**
     * Cubrimos o formulario de contacto con ventas e comprobamos que se envía correctamente e devolve a espera de resposta.
     * @return equals
     */
    @Test
    public void Formulario() {

        driver.get("https://www.avid.com/contact-sales");
        driver.manage().window().setSize(new Dimension(1572, 1026));
        driver.findElement(By.id("siteAlertAccept")).click();
        driver.findElement(By.id("FirstName")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Loli");
        driver.findElement(By.id("LastName")).click();
        driver.findElement(By.id("LastName")).sendKeys("Iglesias");
        driver.findElement(By.id("Title")).sendKeys("DAM");
        driver.findElement(By.id("Company")).sendKeys("DAM Enterprise");
        driver.findElement(By.id("Email")).sendKeys("DAM@gmail.com");
        driver.findElement(By.id("Phone")).sendKeys("600000000");
        driver.findElement(By.id("City")).sendKeys("Santiago de Compostela");
        driver.findElement(By.id("Country")).click();
        WebElement dropdown = driver.findElement(By.id("Country"));
        dropdown.findElement(By.xpath("//option[. = 'España']")).click();
        driver.findElement(By.id("Country")).click();
        driver.findElement(By.id("PostalCode")).click();
        driver.findElement(By.id("PostalCode")).sendKeys("15707");
        driver.findElement(By.id("Describe_Yourself__c")).click();
        WebElement dropdown2 = driver.findElement(By.id("Describe_Yourself__c"));
        dropdown2.findElement(By.xpath("//option[. = 'Artista']")).click();
        driver.findElement(By.id("Describe_Yourself__c")).click();
        driver.findElement(By.id("mktoCheckbox_75637_0")).click();
        driver.findElement(By.id("mktoCheckbox_75637_3")).click();

        driver.findElement(By.id("mktoCheckbox_75637_4")).sendKeys(Keys.TAB);
        driver.findElement(By.id("mktoCheckbox_75637_5")).sendKeys(Keys.TAB);
        driver.findElement(By.id("mktoCheckbox_75637_6")).sendKeys(Keys.TAB);
        driver.findElement(By.id("mktoCheckbox_75637_7")).sendKeys(Keys.TAB);
        driver.findElement(By.id("mktoCheckbox_75637_8")).sendKeys(Keys.TAB);
        driver.findElement(By.id("mktoCheckbox_75637_9")).sendKeys(Keys.TAB);
        driver.findElement(By.linkText("Política de Privacidad.")).sendKeys(Keys.TAB);
        driver.findElement(By.linkText("preferencias de tu correo electrónico")).sendKeys(Keys.TAB);
        driver.findElement(By.linkText("cancelar tu suscripción")).sendKeys(Keys.TAB);

        driver.findElement(By.xpath("/html/body/main/div[3]/section[2]/div/div/form/div[16]/span/button")).click();

        String Resultado = "Gracias por su interés en Avid";
        WebElement Formulario = driver.findElement(By.id("lpeCDiv_536182"));
        String titulo=Formulario.getText();
        assertEquals(Resultado,titulo);

    }

    /**
     * Probamos o menú de Prootols. Comprobamos que nos levou á páxina principal da ferramenta.
     * @return equals
     */
    @Test
    public void Menu1() {

        driver.get("https://www.avid.com");
        
        driver.manage().window().setSize(new Dimension(1572, 1026));
        driver.findElement(By.id("siteAlertAccept")).click();

        driver.findElement(By.xpath("/html/body/div[3]/nav/ul/li[1]/a")).click();


        String Titulo="Pro Tools - Software musical - Avid";
        String Protools=driver.getTitle();
        assertEquals(Titulo,Protools);

    }

    /**
     * Probamos o menú de Media Composer. Comprobamos que nos levou ao sitio desexado.
     * @return equals
     */
    @Test
    public void Menu2() {

        driver.get("https://www.avid.com");
        
        driver.manage().window().setSize(new Dimension(1572, 1026));
        driver.findElement(By.id("siteAlertAccept")).click();
        driver.findElement(By.linkText("Media Composer")).click();

        String Titulo="Media Composer - software de edición de vídeo para cineastas y editores independientes";
        String Composer=driver.getTitle();
        assertEquals(Titulo,Composer);

    }

    /**
     * Probamos o menú de Sibelius. Comprobamos que nos leva ao lugar desexado.
     * @return equals
     */
    @Test
    public void Menu3() {

        driver.get("https://www.avid.com");
        
        driver.manage().window().setSize(new Dimension(1572, 1026));
        driver.findElement(By.id("siteAlertAccept")).click();
        driver.findElement(By.linkText("Sibelius")).click();
        

        String Titulo="Software de notación musical - Sibelius - Avid";
        String Sibelius=driver.getTitle();
        assertEquals(Titulo,Sibelius);

    }

    /**
     * Comprobamos que nos leva ao resource center cando pinchamos nel.
     * @return equals
     */
    @Test
    public void Menu4() {

        driver.get("https://www.avid.com");
        
        driver.manage().window().setSize(new Dimension(1572, 1026));
        driver.findElement(By.id("siteAlertAccept")).click();
        driver.findElement(By.linkText("Pro Tools")).click();
        driver.findElement(By.linkText("Media Composer")).click();
        driver.findElement(By.linkText("Sibelius")).click();
        driver.findElement(By.linkText("Solutions")).click();
        driver.findElement(By.linkText("Centro de Recursos")).click();
        driver.findElement(By.cssSelector("#mp-menu > .add-communities")).click();
        driver.findElement(By.linkText("Centro de Recursos")).click();
        String Titulo="Resource Center";
        String Soluciones=driver.getTitle();
        assertEquals(Titulo,Soluciones);

    }

    /**
     * Probamos un dos links de RSS.
     * @return equals
     */
    @Test
    public void RSS1() {

        driver.get("https://www.avid.com/rss-feeds");
        
        driver.manage().window().setSize(new Dimension(1572, 1026));
        driver.findElement(By.id("siteAlertAccept")).click();

        driver.findElement(By.linkText("Avid Customer Stories")).click();
 
        String Titulo="Avid Customer Stories";
        String RSS1=driver.getTitle();
        assertEquals(Titulo,RSS1);

    }

    /**
     * Probamos outro link de RSS.
     * @return equals
     */
    @Test
    public void RSS2() {

        driver.get("https://www.avid.com/rss-feeds");
        
        driver.manage().window().setSize(new Dimension(1572, 1026));
        driver.findElement(By.id("siteAlertAccept")).click();

        driver.findElement(By.linkText("Avid Press Releases")).click();
 
        String Titulo="Avid Press Releases";
        String RSS2=driver.getTitle();
        assertEquals(Titulo,RSS2);

    }
    
    @After
	public void shutdown() {
		driver.quit();
	}

}
