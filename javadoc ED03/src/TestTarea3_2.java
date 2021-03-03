import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * Test unitarios que prueban funcionalidades de filmaffinity.com
 * 
 * @author Renata Solla
 * @version 1.0
 * @see <a href = "https://www.filmaffinity.com/es/main.html" /> Filmaffinity </a>
 */
public class TestTarea3_2 {
    WebDriver driver;

    /**
     * 
     * Carga el chrome.driver antes de empezar los tests
     */
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "/home/rani/Documentos/2 - Apuntes/1A - DAW 1/Entornos de programacion/UD3/Tarea 3.2/CD_UD3_PruebasSelenium/driver/chromedriver");

        driver = new ChromeDriver();
    }

    /**
     * la app no debe permitir introducir código malicioso en el buscador
     * se prueba introduciendo codigo php y viendo cual es la salida
     * 
     * @throws Failed en caso de que no se abra la ventana de cookies
     */
    @Test
    public void PR3_testCodigoMalicioso() throws InterruptedException {

        driver.get("https://www.filmaffinity.com/es/main.html"); // Abrimos la pagina
        Thread.sleep(2000);
        WebElement cookie = driver.findElement(By.cssSelector("button.css-flk0bs")); // aceptamos popup de las cookies
        cookie.click();
        WebElement buscador = driver.findElement(By.id("top-search-input"));
        WebElement boton = driver.findElement(By.id("button-search"));
        buscador.sendKeys("<?php echo'Soy Codigo Malicioso'?>");
        Thread.sleep(2000);
        boton.click();
        String resultado = driver.findElement(By.cssSelector("div.gs-snippet")).getText();
        System.out.println("Resultado testCodigoMalicioso: " + resultado);

    }

    /**
     * 
     * En el buscador avanzado se introduce una fecha “hasta” anterior a la
     * introducida en “desde” y se recoge el mensaje que genera
     * 
     * @throws Failed en caso de que no se abra la ventana de cookies
     */
    @Test
    public void PR4_testFechasInvertidas() throws InterruptedException {

        driver.get("https://www.filmaffinity.com/es/advsearch.php"); // Abrimos la pagina
        WebElement cookie = driver.findElement(By.cssSelector("button.css-flk0bs")); // aceptamos popup de las cookies
        cookie.click();
        Thread.sleep(1000);
        Select fechadesde = new Select(driver.findElement(By.name("fromyear")));
        fechadesde.selectByVisibleText("2020");
        Thread.sleep(2000);
        Select fechahasta = new Select(driver.findElement(By.name("toyear")));
        fechahasta.selectByVisibleText("2000");
        Thread.sleep(2000);
        WebElement boton = driver.findElement(By.id("adv-search-button"));
        boton.click();
        Thread.sleep(2000);
        String resultado = driver.findElement(By.id("adv-search-no-results")).getText();
        System.out.println("Resultado testFechasInvertidas: " + resultado);
    }
    
    /**
     * 
     * Se hace un registro con un email temporal tipo yopmail 
     * y se recoge el mensaje que genera
     * 
     * @throws Failed en caso de que no se abra la ventana de cookies
     */     
    @Test
    public void PR5_registroMailTemporal() throws InterruptedException {
        

        driver.get("https://www.filmaffinity.com/es/register.php"); // Abrimos la pagina
        Thread.sleep(2000);
        WebElement cookie = driver.findElement(By.cssSelector("button.css-flk0bs")); // aceptamos popup de las cookies
        cookie.click();
        driver.findElement(By.name("nick")).sendKeys("rani108");
        driver.findElement(By.name("email")).sendKeys("rani108@yopmail.com");
        driver.findElement(By.name("username")).sendKeys("rani108");
        driver.findElement(By.name("password1")).sendKeys("123456789");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value = 'Continuar']")).submit();
        Thread.sleep(5000);
        String resultado = driver.findElement(By.xpath("//*[@id='reg-box']/form/div[6]/div[2]/div/p")).getText();
        System.out.println("Resultado test registroMailTemporal: " + resultado);
    }

    /**
     * 
     * Se prueba a votar una pelicula sin estar registrado
     * y se muestra titulo de la página a la que es redirigido
     * 
     * @throws Failed en caso de que no se abra la ventana de cookies 
     */
    @Test
    public void PR8_votoSinRegistro() throws InterruptedException {
        driver.get("https://www.filmaffinity.com/es/film344683.html"); // Abrimos la pagina
        WebElement cookie = driver.findElement(By.cssSelector("button.css-flk0bs")); // aceptamos las cookies
        cookie.click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("a.sign-in")).click();
        Thread.sleep(2000);
        System.out.println("Resultado test votoSinRegistro: " + driver.getTitle());

    }

    /**
     *  Accede a filmaffinity EEUU desde España
     * 
     * @throws Failed en caso de que no se abra la ventana de cookies 
     */
    @Test
    public void PR2_testWebEEUU() throws InterruptedException {

        driver.get("https://filmaffinity.com/es/main.php"); // Abrimos la pagina
        WebElement cookie = driver.findElement(By.cssSelector("button.css-flk0bs")); // aceptamos las cookies
        cookie.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='header-bottom']/div/div[2]/ul/li")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='header-bottom']/div/div[3]/div[2]/ul[1]/li[1]/ul/li[1]/img")).click();
        Thread.sleep(2000);
        String resultado = driver.findElement(By.cssSelector("div.logo-siteloc")).getText();
        System.out.println("Resultado testWebEEUU: " + resultado);
    }

    /**
     * Apaga el chromedriver al acabar los tests
     */ 
    @After
    public void shutdown() {
        driver.quit();
    }
}
